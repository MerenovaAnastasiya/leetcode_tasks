package com.merenaas.easy;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {

//    -10, -1, 0, 2, 4, 5
//    0 1 4 16 25 100

    public static void main(String[] args) {
        var solution = new Solution();
        int[] res = solution.sortedSquares(new int[]{-10, -1, 0, 2, 4, 5});
        System.out.println(Arrays.toString(res));
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int i = 0;
            int currentIndex = nums.length - 1;
            int j = nums.length - 1;
            int[] res = new int[nums.length];
            while (i <= j) {
                if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                    res[currentIndex--] = nums[i] * nums[i];
                    i++;
                } else {
                    res[currentIndex--] = nums[j] * nums[j];
                    j--;
                }
            }
            return res;
        }
    }
}
