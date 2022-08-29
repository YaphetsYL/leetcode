package com.yl.leetcode.medium.aug22;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/19 - 08 - 19 - 14:38
 * @Description com.yl.leetcode.medium
 */
public class LC659 {


    public boolean isPossible(int[] nums) {


        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> appendfreq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (freq.get(i) == 0) {
                continue;
            } else if (appendfreq.getOrDefault(i, 0) > 0) {
                appendfreq.put(i, appendfreq.get(i) - 1);
                appendfreq.put(i + 1, appendfreq.getOrDefault(i + 1, 0) + 1);
            } else if (freq.getOrDefault(i + 1, 0) > 0 && freq.getOrDefault(i + 2, 0) > 0) {
                freq.put(i + 1, freq.get(i + 1) - 1);
                freq.put(i + 2, freq.get(i + 2) - 1);
                appendfreq.put(i + 3, appendfreq.getOrDefault(i + 3, 0) + 1);
            } else {
                return false;
            }
            freq.put(i, freq.get(i) - 1);
        }


        return true;

    }
}
