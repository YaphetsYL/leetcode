package com.yl.leetcode.easy.aug22;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/29 - 08 - 29 - 1:19
 * @Description Word Pattern
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
public class LC290 {

    /*public static void main(String[] args) {
        LC290 lc = new LC290();
        System.out.println(lc.wordPattern("abba",
                "dog cat cat dog"));
        System.out.println(lc.wordPattern("abba",
                "dog dog dog dog"));
        *//*System.out.println(lc.wordPattern("abba",
                "dog cat cat fish"));*//*
    }*/


    public boolean wordPattern(String pattern, String s) {
        String[] split = s.trim().split(" ");
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(split[i])) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), split[i]);
            }
        }

        return true;
    }

    /*public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i) {
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }*/


}
