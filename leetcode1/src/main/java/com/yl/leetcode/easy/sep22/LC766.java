package com.yl.leetcode.easy.sep22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/9/1 - 09 - 01 - 16:03
 * @Description Toeplitz Matrix
 * <p>
 * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
 * <p>
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 */
public class LC766 {
    public boolean isToeplitzMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
