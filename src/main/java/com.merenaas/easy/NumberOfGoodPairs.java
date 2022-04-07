package com.merenaas.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
//    https://leetcode.com/problems/number-of-good-pairs/

    public static void main(String[] args) {
        var solution = new Solution();
        int[] array = new int[]{1, 1, 1, 1};
        int result = solution.numIdenticalPairs(array);
        System.out.println(result);
    }

    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int res = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
                res += map.get(n) - 1;
            }
            return res;
        }
    }
}
