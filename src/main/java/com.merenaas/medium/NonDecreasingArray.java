package com.merenaas.medium;

public class NonDecreasingArray {

    //    https://leetcode.com/problems/non-decreasing-array/
    public static void main(String[] args) {
//        [5, 7, 1, 8]
//        [-1,4,2,3]
//        [4,2,3]
//        [4,2,1]
        int[] nums = new int[]{5, 7, 1, 8};
        var solution = new Solution();
        boolean result = solution.checkPossibility(nums);
        System.out.println(result);
    }

    static class Solution {
        public boolean checkPossibility(int[] nums) {
            int prev = -1;
            int prev2 = -1;
            boolean flag = false;
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    prev2 = nums[i];
                    flag = true;
                    count++;
                } else {
                    if (flag) {
                        if (prev > nums[i] && prev2 > nums[i+1]) {
                            return false;
                        }
                    }
                    flag = false;
                    prev = nums[i];
                }
                if (count > 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
