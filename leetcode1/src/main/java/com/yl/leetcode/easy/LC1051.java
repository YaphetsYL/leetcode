package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/21 - 08 - 21 - 19:53
 * @Description Height Checker
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line
 * in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i]
 * is the expected height of the ith student in line.
 * <p>
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 * <p>
 * Return the number of indices where heights[i] != expected[i].
 */
public class LC1051 {
    /*public static void main(String[] args) {
        LC1051 lc = new LC1051();
        int[] test = {8, 1, 4, 7, 6, 4, 1, 2, 2, 7, 5, 5, 4, 8, 5, 7, 4, 5, 2, 8, 5, 2, 8};
        System.out.println(lc.heightChecker(test));
    }*/

    /*public int heightChecker(int[] heights) {
        int[] target = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            target[i] = heights[i];
        }
        Arrays.sort(target);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != target[i]) {
                count++;
            }
        }
        return count;
    }*/

    public int heightChecker(int[] heights) {

        int[] freq = new int[101];
        for (int height : heights) {
            freq[height]++;
        }
        int result = 0;
        int curHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            while (freq[curHeight] == 0) {
                curHeight++;
            }
            if (curHeight != heights[i]) {
                result++;
            }

            freq[curHeight]--;
        }
        return result;

    }















    /*public int heightChecker(int[] heights) {
        int[] heightToFreq = new int[101];

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }*/
}
