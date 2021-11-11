package com.merenaas.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[]{3, 3};
        var target = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            var numberWithIndexMap = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                var currentNumber = nums[i];
                var index = numberWithIndexMap.get(target - currentNumber);
                if (index != null) {
                    return new int[]{index, i};
                } else {
                    numberWithIndexMap.put(currentNumber, i);
                }
            }
            return new int[2];
        }
    }
}

