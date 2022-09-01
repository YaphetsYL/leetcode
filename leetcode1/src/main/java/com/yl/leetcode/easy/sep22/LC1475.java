package com.yl.leetcode.easy.sep22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/9/1 - 09 - 01 - 15:53
 * @Description Final Prices With a Special Discount in a Shop
 * <p>
 * Given the array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items in the shop,
 * if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i],
 * otherwise, you will not receive any discount at all.
 * <p>
 * Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.
 */
public class LC1475 {

    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    /*public int[] finalPrices(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i])
                A[stack.pop()] -= A[i];
            stack.push(i);
        }
        return A;
    }*/
}
