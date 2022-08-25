package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/25 - 08 - 25 - 18:55
 * @Description Ransom Note
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 */
public class LC383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] mag = new int[26];
        for (char c : magazine.toCharArray()) {
            mag[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            mag[c - 'a']--;
            if (mag[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
