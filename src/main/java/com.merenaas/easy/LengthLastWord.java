package com.merenaas.easy;

// https://leetcode.com/problems/length-of-last-word/
public class LengthLastWord {

    public static void main(String[] args) {
        var solution = new Solution();
        int result1 = solution.lengthOfLastWord("luffy is still joyboy");
        System.out.println(result1);
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            int currentIndex = s.length() - 1;
            int maxLength = 0;
            boolean isAWord = false;
            while (currentIndex >= 0) {
                if (s.charAt(currentIndex) == ' ') {
                    if (isAWord) {
                        return maxLength;
                    }
                } else {
                    isAWord = true;
                    maxLength++;
                    if (currentIndex == 0) {
                        return maxLength;
                    }
                }
                currentIndex--;
            }
            return maxLength;
        }
    }
}
