package com.merenaas.easy;

//https://leetcode.com/problems/plus-one/

public class PlusOne {

    //in: [1, 9, 9]

    //out: [2, 0, 0]

    public static void main(String[] args) {

    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int[] res = new int[digits.length + 1];
            int carry = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                int sum = digits[i] + carry;
                if (sum <= 9) {
                    digits[i] = sum;
                    res[i+1] = sum;
                    carry = 0;
                } else {
                    int mod = sum % 10;
                    carry = 1;
                    digits[i] = mod;
                    res[i+1] = mod;
                }
            }
            if (carry == 0) {
                return digits;
            } else {
                res[0] = carry;
                return res;
            }
        }
    }

}
