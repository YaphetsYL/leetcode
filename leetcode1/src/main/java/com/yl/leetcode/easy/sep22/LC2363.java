package com.yl.leetcode.easy.sep22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/9/5 - 09 - 05 - 23:47
 * @Description Merge Similar Items
 * <p>
 * You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:
 * <p>
 * items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
 * The value of each item in items is unique.
 * Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.
 * <p>
 * Note: ret should be returned in ascending order by value.
 */
public class LC2363 {

    public static void main(String[] args) {
        LC2363 lc2363 = new LC2363();
        int[][] i1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] i2 = {{3, 1}, {1, 5}};

        System.out.println(lc2363.mergeSimilarItems(i1, i2));
    }


    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] item = new int[1001];
        for (int i = 0; i < items1.length; i++) {
            item[items1[i][0]] += items1[i][1];
        }

        for (int i = 0; i < items2.length; i++) {
            item[items2[i][0]] += items2[i][1];
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < item.length; i++) {
            if (item[i] != 0) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(item[i]);
                result.add(temp);
            }
        }
        return result;
    }


    /*public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        int count[] = new int[1005];
        for (int arr[] : items1) {
            // treat value as index and  weight as value
            count[arr[0]] += arr[1];
        }
        for (int arr[] : items2) {
            // treat value as index and  weight as value
            count[arr[0]] += arr[1];
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(count[i]);
            // now just simply add the answer and store value as index and weight as value in pair
            ans.add(temp);
        }
        return ans;
    }*/
}
