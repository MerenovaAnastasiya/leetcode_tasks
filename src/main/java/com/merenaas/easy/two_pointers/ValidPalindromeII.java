package com.merenaas.easy.two_pointers;

public class ValidPalindromeII {

    public static void main(String[] args) {
        var solution = new Solution();
        boolean res = solution.validPalindrome("abc");
        System.out.println(res);
    }

    static class Solution {
        public boolean validPalindrome(String s) {
            return isPalindrome(s, false);
        }

        private boolean isPalindrome(String s, boolean isSubstring) {
            int leftIndex = 0;
            int rightIndex = s.length() - 1;
            while(leftIndex <= rightIndex) {
                char left = s.charAt(leftIndex);
                char right = s.charAt(rightIndex);
                if(left==right) {
                    leftIndex++;
                    rightIndex--;
                } else {
                    if(isSubstring)
                        return false;
                    else {
                        return isPalindrome(s.substring(leftIndex+1, rightIndex+1), true) ||
                        isPalindrome(s.substring(leftIndex, rightIndex), true);
                    }
                }
            }
            return true;
        }
    }
}
