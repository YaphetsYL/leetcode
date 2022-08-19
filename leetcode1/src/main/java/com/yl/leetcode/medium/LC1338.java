package com.yl.leetcode.medium;

import java.util.*;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/18 - 08 - 18 - 10:27
 * @Description Reduce Array Size to The Half
 * You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
 * <p>
 * Return the minimum size of the set so that at least half of the integers of the array are removed.
 */
public class LC1338 {

    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int sum = 0;
        int result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            result++;
            if (sum * 2 >= arr.length) {
                break;
            }
        }
        return result;
    }






    /*public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(hashMap.values());
        Collections.sort(list);

        int result = 0;
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            result++;
            if (sum * 2 >= arr.length) {
                break;
            }
        }
        return result;

    }*/
}
