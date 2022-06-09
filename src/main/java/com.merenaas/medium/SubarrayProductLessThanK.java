package com.merenaas.medium;

public class SubarrayProductLessThanK {


    public static void main(String[] args) {
        var solution = new Solution();
        int result = solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0);
        System.out.println(result);
    }

    static class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int start = 0;
            int multiplicationResult = 1;
            int res = 0;
            for (int end = 0; end < nums.length; end++) {
                int current = nums[end];
                multiplicationResult *= current;
                if (multiplicationResult >= k) {
                    while (multiplicationResult >= k && start <= end) {
                        multiplicationResult /= nums[start];
                        start++;
                    }
                }
                res += end - start + 1;
            }
            return res;

        }

    }
}
