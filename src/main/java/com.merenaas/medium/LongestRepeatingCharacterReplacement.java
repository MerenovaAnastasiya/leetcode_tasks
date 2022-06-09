package com.merenaas.medium;

public class LongestRepeatingCharacterReplacement {

//  https://leetcode.com/problems/longest-repeating-character-replacement/
//  tag: sliding window
    public static void main(String[] args) {
        var solution = new Solution();
        int result = solution.characterReplacement("ABABZ", 1);
        System.out.println(result);
    }

    static class Solution {
        public int characterReplacement(String s, int k) {
            int[] charCache = new int[26];
            int maxCurrentLength = 0;
            int maxLength = 0;
            int start = 0;

            for (int end = 0; end < s.length(); end++) {
                char current = s.charAt(end);
                charCache[current - 'A']++;
                maxCurrentLength = Math.max(maxCurrentLength, charCache[current - 'A']);
                int otherChars = end - start + 1 - maxCurrentLength;
                if (otherChars <= k) {
                    maxLength = Math.max(maxLength, end - start + 1);
                } else {
                    charCache[s.charAt(start) - 'A']--;
                    start++;
                    maxCurrentLength = 0;
                }
            }

            return maxLength;
        }
    }
}
