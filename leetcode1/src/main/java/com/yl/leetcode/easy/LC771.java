package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/29 - 08 - 29 - 2:11
 * @Description Jewels and Stones
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * <p>
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class LC771 {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        int[] list = new int[58];
        for (char c : stones.toCharArray()) {
            list[c - 'A']++;
        }
        for (char c : jewels.toCharArray()) {
            result += list[c - 'A'];
        }
        return result;
    }


    /*public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        for (int i = 0 ; i < stones.length(); i ++) {
            if(jewels.indexOf(stones.charAt(i)) != -1) {
                num++;
            }
        }
        return num;
    }*/
}
