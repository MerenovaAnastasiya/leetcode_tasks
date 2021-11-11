package com.merenaas.easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(-1));
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(33));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x / 10 != 0)) {
                return false;
            }
            if (x / 10 == 0) {
                return true;
            }
            var y = 0;
            while (x > y) {
                y = y * 10 + x % 10;
                x = x / 10;
            }
            return (x == y || x == y / 10);

        }
    }

}


