package com.yl.leetcode.easy.sep22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/9/5 - 09 - 05 - 23:44
 * @Description Count Square Sum Triples
 * <p>
 * A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.
 * <p>
 * Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
 */
public class LC1925 {

    public int countTriples(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = i * i + j * j;
                int k = (int) Math.sqrt(sum);
                if (k * k == sum && k <= n) {
                    result += 2;
                }
            }
        }
        return result;
    }
}
