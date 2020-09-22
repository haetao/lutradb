package io.lutra.common;

import io.lutra.common.util.RegexUtil;

import java.awt.*;
import java.util.List;

import static java.lang.Long.valueOf;

public class App {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5,7,6};
        System.out.println(findMaxValue(arr,0,arr.length));
    }
    public static double findMaxValue(double[] arr,int left,int right){
        if(arr.length < 3){
            return -1;
        }
        int midIndex = (left+right)/2;
        if(arr[midIndex] > arr[midIndex-1] && arr[midIndex] > arr[midIndex+1]){
            return arr[midIndex];
        }else if (arr[midIndex] < arr[midIndex-1]){
            return findMaxValue(arr,left,midIndex);
        }else if(arr[midIndex] > arr[midIndex-1]){
            return findMaxValue(arr,midIndex,right);
        }
        return -1;
    }

    public static long findMaxFromString(String s){
        char[] arr = s.toCharArray();
        if(arr.length < 62) {
            return 0;
        }
        int lastMax = 0;
        for(int i = 0;i < arr.length;i++){
            int nowMax = 0;
            for(int j = i+1;j < arr.length;j++){
                if(Character.isDigit(arr[j])){
                    nowMax = nowMax + Integer.parseInt(String.valueOf(arr[j]));
                }
                if(arr[i] == arr[j] && i != j-1){
                    lastMax = Math.max(lastMax, nowMax);
                }
            }
            nowMax = 0;
        }
        return lastMax;
    }

    public static String find(String s){
        char[] arr = s.toCharArray();
        if(arr.length < 62) {
            return null;
        }
        int lastMax = 0;
        for(int i = 0;i < arr.length;i++){
            int nowMax = 0;
            for(int j = i+1;j < arr.length;j++){
                if(Character.isDigit(arr[j])){
                    nowMax = nowMax + Integer.parseInt(String.valueOf(arr[j]));
                }
                if(arr[i] == arr[j] && i != j-1){
                    lastMax = Math.max(lastMax, nowMax);
                }
            }
            nowMax = 0;
        }
        return "";
    }
}
