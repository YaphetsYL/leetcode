package com.yl.leetcode.hard.aug22;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/21 - 08 - 21 - 0:51
 * @Description Minimum Number of Refueling Stops
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 * <p>
 * There are gas stations along the way. The gas stations are represented as an array stations where stations[i] = [positioni, fueli] indicates that the ith gas station is positioni miles east of the starting position and has fueli liters of gas.
 * <p>
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it. It uses one liter of gas per one mile that it drives. When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 * <p>
 * Return the minimum number of refueling stops the car must make in order to reach its destination. If it cannot reach the destination, return -1.
 * <p>
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there. If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 */
public class LC871 {

    /*public static void main(String[] args) {
        LC871 lc = new LC871();

        int[][] b = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        System.out.println(lc.minRefuelStops(100, 10, b));
    }*/

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (startFuel >= target) {
            return 0;
        }
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int i = 0;
        int n = stations.length;
        int stops = 0;
        int maxDistance = startFuel;
        while (maxDistance < target) {
            while (i < n && stations[i][0] <= maxDistance) {
                queue.offer(stations[i++][1]);
            }
            if (queue.isEmpty()) {
                return -1;
            }
            maxDistance += queue.poll();
            stops++;
        }
        return stops;
    }


}

