package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/16 - 08 - 16 - 23:01
 * @Description Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class LC387 {

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
