package com.example.lab2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringService {
    private static String basePattern =  "[\\s,.]";
    public static int CountWords(String input){
        String[] arr = input.split(basePattern.concat("+"));
        return arr.length;
    }

    public static int CountSymbols(String input) {
        Pattern pattern = Pattern.compile(basePattern);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        //pre Java 9 method ftw??
        while (matcher.find())
            count++;
        return count;
    }
}
