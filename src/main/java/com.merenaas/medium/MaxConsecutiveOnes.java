package com.merenaas.medium;

public class MaxConsecutiveOnes {
//    https://leetcode.com/problems/max-consecutive-ones-iii/submissions/
//    tag: sliding window
    public static void main(String[] args) {
        var solution = new Solution();
        int result = solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);
        System.out.println(result);
    }

    static class Solution {
        public int longestOnes(int[] nums, int k) {
            int start = 0;
            int flipCount = 0;
            int max = 0;

            for (int end = 0; end < nums.length; end++) {
                if (nums[end] == 0) {
                    if (flipCount < k)
                        flipCount++;
                    else {
                        while (start < nums.length && nums[start] != 0) start++;
                        start++;
                    }
                }
                max = Math.max(max, end - start + 1);
            }
            return max;

        }
    }
}
