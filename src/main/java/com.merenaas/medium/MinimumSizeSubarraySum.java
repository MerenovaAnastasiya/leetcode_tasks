package com.merenaas.medium;

public class MinimumSizeSubarraySum {

//    tag: sliding window
    public static void main(String[] args) {
        var solution = new Solution();
        int result = solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(result);
    }

    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int minLength = Integer.MAX_VALUE;

            int sum = 0;
            int windowStart = 0;
            for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
                sum += nums[windowEnd];
                while(sum >= target) {
                    minLength = Math.min(minLength, windowEnd - windowStart + 1);
                    sum -= nums[windowStart++];
                }
            }

            if (minLength == Integer.MAX_VALUE) {
                return 0;
            }
            return minLength;
        }
    }

}
