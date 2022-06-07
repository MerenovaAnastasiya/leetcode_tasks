package com.merenaas.easy;

public class RemoveDuplicatesFromSortedArray {

//    https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 1;
            if (nums.length == 1)
                return k;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1])
                    nums[k++] = nums[i];
            }
            return k;
        }
    }
}
