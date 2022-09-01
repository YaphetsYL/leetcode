package com.yl.leetcode.easy.sep22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/9/1 - 09 - 01 - 23:45
 * @Description Running Sum of 1d Array
 * <p>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 */
public class LC1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

}
