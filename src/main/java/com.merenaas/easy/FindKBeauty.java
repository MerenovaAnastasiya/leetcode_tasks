package com.merenaas.easy;

public class FindKBeauty {
//    https://leetcode.com/problems/find-the-k-beauty-of-a-number/

    public static void main(String[] args) {

        var solution = new Solution();
        int res = solution.divisorSubstrings(240, 2);
        System.out.println(res);

    }

    static class Solution {
        public int divisorSubstrings(int num, int k) {
            int result = 0;
            int x = num;
            while(x > 0 && x >= Math.pow(10, k - 1)) {
                int current = (int)(x % Math.pow(10, k));
                if(current > 0 && num % current == 0)
                    result++;
                x /= 10;
            }
            return result;
        }
    }
}
