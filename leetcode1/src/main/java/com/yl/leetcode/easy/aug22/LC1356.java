package com.yl.leetcode.easy.aug22;

import java.util.Arrays;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/29 - 08 - 29 - 1:58
 * @Description Sort Integers by The Number of 1 Bits
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their
 * binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 * <p>
 * Return the array after sorting it.
 */
public class LC1356 {
    public int[] sortByBits(int[] arr) {
        // apply a bitcount modifier to the array values
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        // sort the array, and remove the bitcount modifier
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }

        // return the sorted array
        return arr;
    }
}
