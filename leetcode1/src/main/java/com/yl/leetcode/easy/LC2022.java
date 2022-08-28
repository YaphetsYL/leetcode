package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/29 - 08 - 29 - 2:01
 * @Description Convert 1D Array Into 2D Array
 * <p>
 * You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n.
 * You are tasked with creating a 2-dimensional (2D) array with m rows and n columns using all the elements from original.
 * <p>
 * The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array,
 * the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
 * <p>
 * Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
 */
public class LC2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }
        return result;
    }

    /*public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];
        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++)
            result[i / n][i % n] = original[i];
        return result;
    }*/

}
