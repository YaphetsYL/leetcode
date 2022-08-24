package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/24 - 08 - 24 - 23:43
 * @Description Power of Three
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <p>
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
public class LC326 {
    public boolean isPowerOfThree(int n) {
        while (n > 0 && n % 3 == 0) {
            n = n / 3;
        }
        return 1 == n;
    }

    /*public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }*/
}
