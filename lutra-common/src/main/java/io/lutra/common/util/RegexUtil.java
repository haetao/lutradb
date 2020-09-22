package io.lutra.common.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RegexUtil {
    public static List<String> findMatchedStrings(String regex,String source){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        List<String> result = new LinkedList<>();
        while(matcher.find()){
            result.add(matcher.group(1));
        }
        return result;
    }

    public static String findRegexAndReplace(String regex,String source,String replacement){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        StringBuffer buffer = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(buffer,replacement);
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}
