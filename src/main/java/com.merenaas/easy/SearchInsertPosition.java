package com.merenaas.easy;

public class SearchInsertPosition {

    public static void main(String[] args) {
        var solution = new Solution();
        int result = solution.searchInsert(new int[]{1, 4, 5, 8}, 2);
        System.out.println(result);
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            if (nums[0] >= target) {
                return 0;
            }
            if (nums[nums.length - 1] < target) {
                return nums.length;
            }

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int m = left + (right - left) / 2;
                if (target == nums[m]) {
                    return m;
                } else {
                    if (target > nums[m]) {
                        left = m + 1;
                    } else {
                        right = m - 1;
                    }
                }
            }
            return left;
        }


    }
}
