package com.merenaas.hard;

import java.util.Arrays;
import java.util.TreeMap;

public class SlidingWindowMaximum {

//    https://leetcode.com/problems/sliding-window-maximum/

    public static void main(String[] args) {
        var solution = new Solution();
        int[] res = solution.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
        System.out.println(Arrays.toString(res));
    }

    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
            int[] result = new int[nums.length - k + 1];
            for (int i = 0; i < k; i++) {
                map.merge(nums[i], 1, Integer::sum);
            }
            int lastKey = map.lastKey();
            result[0] = lastKey;
            int count = map.get(nums[0]);
            if (count > 1)
                map.put(nums[0], --count);
            else
                map.remove(nums[0]);
            for (int i = k, j = 1; i < nums.length && j < result.length; i++, j++) {
                map.merge(nums[i], 1, Integer::sum);
                lastKey = map.lastKey();
                result[j] = lastKey;
                count = map.get(nums[i - k + 1]);
                if (count > 1)
                    map.put(nums[i - k + 1], --count);
                else
                    map.remove(nums[i - k + 1]);
            }
            return result;
        }
    }
}
