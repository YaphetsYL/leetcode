package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/16 - 08 - 16 - 23:01
 * @Description First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class LC387 {

    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();
        // build char count bucket : <charIndex, count>
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        // find the index
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;

    }
    /*public int firstUniqChar(String s) {
        int index[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int character = s.charAt(i) - 'a';
            index[character]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int character = s.charAt(i) - 'a';
            if (index[character] == 1) {
                return i;
            }

        }
        return -1;
    }*/

    /*public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }*/
}
