package com.merenaas.medium;

import java.util.HashMap;

public class SubarraySumEqualsK {

//  https://leetcode.com/problems/subarray-sum-equals-k/

    public static void main(String[] args) {
        var array = new int[]{0};
        int k = 0;
//        в карте ключ=сумма, значение = счетчик
//        {0:1, }
//        sum = 1
//        {0:1, 1: 1}
//        {0: 1, 1:1, 6: 1}
//        {}


        var solution = new Solution();
        var result = solution.subarraySum(array, k);
        System.out.println(result);
    }

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            int sum = 0;
            var map = new HashMap<Integer, Integer>();
            map.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[0];
                if (map.containsKey(sum - k))
                    count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
    }
}
