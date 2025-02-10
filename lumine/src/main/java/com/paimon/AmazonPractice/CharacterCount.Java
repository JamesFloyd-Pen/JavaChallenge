package com.paimon.AmazonPractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    
    public static void main(String[] args) {
        String str = "example";
        Map<Character, Integer> charCountMap = getCharacterCount(str);
        System.out.println(charCountMap);
    }

    public static Map<Character, Integer> getCharacterCount(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}