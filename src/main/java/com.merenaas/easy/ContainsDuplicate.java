package com.merenaas.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

//  https://leetcode.com/problems/contains-duplicate-ii/

    public static void main(String[] args) {
//        [1,2,3,1,2,3], k =2
        var solution = new Solution();
        boolean result = solution.containsNearbyDuplicate(new int[]{1,0,1,1}, 1);
        System.out.println(result);
    }

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i <= k; i++) {
                int current = nums[i];
                if(set.contains(current))
                    return true;
                set.add(current);
            }
            set.remove(nums[0]);
            for(int i = k + 1; i < nums.length; i++) {
                int current = nums[i];
                if(set.contains(current))
                    return true;
                set.add(current);
                set.remove(nums[i-k]);
            }
            return false;
        }
    }
}
