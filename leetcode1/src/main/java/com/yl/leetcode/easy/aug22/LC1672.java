package com.yl.leetcode.easy.aug22;

import java.util.Arrays;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/29 - 08 - 29 - 21:36
 * @Description Richest Customer Wealth
 * <p>
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith​customer has in the jth​bank.
 * Return the wealth that the richest customer has.
 * <p>
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class LC1672 {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp;
        for (int i = 0; i < accounts.length; i++) {
            temp = 0;
            for (int j : accounts[i]) {
                temp += j;
            }
            result = Math.max(result, temp);
        }
        return result;
    }

    /* //slow
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
    }
*/

}

