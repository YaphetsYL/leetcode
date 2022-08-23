package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/21 - 08 - 21 - 20:26
 * @Description Two Furthest Houses With Different Colors
 * There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
 * <p>
 * Return the maximum distance between two houses with different colors.
 * <p>
 * The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
 */
public class LC2078 {
    public int maxDistance(int[] colors) {

        int res = 0, n = colors.length;
        for (int i = 0; i < n; ++i) {
            if (colors[i] != colors[0]) {
                res = Math.max(res, i);
            }
            if (colors[i] != colors[n - 1]) {
                res = Math.max(res, n - 1 - i);
            }
        }
        return res;
    }
}
