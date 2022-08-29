package com.yl.leetcode.easy.aug22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/29 - 08 - 29 - 21:13
 * @Description Make Two Arrays Equal by Reversing Sub-arrays
 * <p>
 * You are given two integer arrays of equal length target and arr. In one step,
 * you can select any non-empty sub-array of arr and reverse it. You are allowed to make any number of steps.
 * <p>
 * Return true if you can make arr equal to target or false otherwise.
 */
public class LC1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        int[] num = new int[1001];
        for (int i : arr) {
            num[i]++;
        }

        for (int i : target) {
            num[i]--;
            if (num[i] < 0) {
                return false;
            }
        }
        return true;
    }

    /*public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }*/
}
