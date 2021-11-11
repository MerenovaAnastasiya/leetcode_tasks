package com.merenaas.easy;

import java.util.Optional;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[]{1, 2, -2147483648};
        System.out.println(solution.thirdMax(nums));
    }

    static class Solution {
        public int thirdMax(int[] nums) {
            Optional<Integer> max = Optional.of(nums[0]);
            Optional<Integer> max2 = Optional.empty();
            Optional<Integer> max3 = Optional.empty();
            for (int i = 0; i < nums.length; i++) {
                var current = nums[i];
                if (current > max.get()) {
                    max3 = max2;
                    max2 = max;
                    max = Optional.of(current);
                } else if (max2.isEmpty() || current > max2.get()) {
                    if (current != max.get()) {
                        max3 = max2;
                        max2 = Optional.of(current);
                    }
                } else if (max3.isEmpty() || current > max3.get()) {
                    if (current != max2.get()) {
                        max3 = Optional.of(current);
                    }
                }
            }
            return max3.isEmpty() ? max.get() : max3.get();
        }
    }
}
