package com.yl.leetcode.easy;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/23 - 08 - 23 - 23:24
 * @Description Power of Four
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * <p>
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 */
public class LC342 {
    /*public boolean isPowerOfFour(int n) {
        while (n > 0 && n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
*/

    public boolean isPowerOfFour(int n) {
        return (n > 0) && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}
