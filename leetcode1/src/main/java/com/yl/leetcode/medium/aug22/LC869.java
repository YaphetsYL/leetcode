package com.yl.leetcode.medium.aug22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/26 - 08 - 26 - 23:00
 * @Description Reordered Power of 2
 * You are given an integer n. We reorder the digits in any order (including the original order) such that the leading digit is not zero.
 * <p>
 * Return true if and only if we can do this so that the resulting number is a power of two.
 */
public class LC869 {

    public boolean reorderedPowerOf2(int N) {
        long c = counter(N);
        for (int i = 0; i < 32; i++) {
            if (counter(1 << i) == c) {
                return true;
            }
        }
        return false;
    }

    public long counter(int N) {
        long res = 0;
        for (; N > 0; N /= 10) {
            res += (int) Math.pow(10, N % 10);
        }
        return res;
    }

    /*public boolean reorderedPowerOf2(int N) {
        char[] a1 = String.valueOf(N).toCharArray();
        Arrays.sort(a1);
        String s1 = new String(a1);

        for (int i = 0; i < 31; i++) {
            char[] a2 = String.valueOf((int) (1 << i)).toCharArray();
            Arrays.sort(a2);
            String s2 = new String(a2);
            if (s1.equals(s2)) {
                return true;
            }
        }

        return false;
    }*/
}
