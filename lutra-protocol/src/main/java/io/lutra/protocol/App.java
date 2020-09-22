package io.lutra.protocol;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] arr = {"fix","fix","fi"};
        System.out.println(longestCommonPrefix(arr));
    }

    private static int reverse(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        if(arr.length == 1){
            return Integer.parseInt(String.copyValueOf(arr));
        }
        if(arr[0] == '-'){
            char[] arrC = new char[arr.length-1];
            System.arraycopy(arr,1,arrC,0,arr.length-1);
            arr = arrC;
            if(arr.length == 1){
                return Integer.parseInt(String.copyValueOf(arr));
            }
            return -reverObj(arr);
        }
        return reverObj(arr);
    }

    private static int reverObj(char[] arr){
        int i = 0;
        int j = arr.length-1;
        if(arr[arr.length-1] == '0'){
            char[] arrC = new char[arr.length-1];
            System.arraycopy(arr,0,arrC,0,arr.length-1);
            return reverObj(arrC);
        }
        while(i<j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return Long.parseLong(String.copyValueOf(arr)) > Integer.MAX_VALUE ? 0 :
                Integer.parseInt(String.copyValueOf(arr));
    }

    static int romanToInt(String s) {
        if (s == null || s.equals("")) return -1;
        Map<String, Integer> metadata = new HashMap<>();
        metadata.put("I", 1);
        metadata.put("V", 5);
        metadata.put("X", 10);
        metadata.put("L", 50);
        metadata.put("C", 100);
        metadata.put("D", 500);
        metadata.put("M", 1000);
        String[] arr = s.split("");
        int result = 0;
        String preRo = "";
        int preNum = 0;
        for (String c : arr) {
            int num = metadata.get(c);
            switch ((preRo + c)) {
                case "IV":
                case "IX":
                case "XL":
                case "XC":
                case "CD":
                case "CM":
                    result = result + num - 2*preNum;
                    preRo = c;
                    preNum = num;
                    break;
                default:
                    result += num;
                    preRo = c;
                    preNum = num;
            }
        }
        if(result<1 || result>3999){
            return -1;
        }
        return result;
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 1){
            return  "";
        }
        String[] arr = strs[0].split("");
        String prefix = "";
        int k = 0;
        int sy = 0;
        for(String s : arr){
            for(int i=1; i < strs.length; i++){
                String[] arrTmp = strs[i].split("");
                if(k < arrTmp.length && arrTmp[k].equals(s)){
                    prefix = prefix + s;
                    sy = i;
                    k++;
                }else{
                    sy = i;
                    k++;
                    break;
                }
            }
        }
        if(sy == strs.length-1){
            return prefix;
        }else {
            return "";
        }
    }

}
