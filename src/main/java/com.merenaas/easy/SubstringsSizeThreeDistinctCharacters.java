package com.merenaas.easy;

import java.util.HashMap;
import java.util.Map;

public class SubstringsSizeThreeDistinctCharacters {

//    https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

    public static void main(String[] args) {
        //"xyzzaz"
        var solution = new Solution();
        int res = solution.countGoodSubstrings("xyzzaz");
        System.out.println(res);


    }

    static class Solution {
        public int countGoodSubstrings(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int res = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                if (i == 0) {
                    map.put(s.charAt(i), 1);
                    map.merge(s.charAt(i + 1), 1, Integer::sum);
                }
                map.merge(s.charAt(i + 2), 1, Integer::sum);
                if (map.values().stream().filter(x -> x > 0).allMatch(x -> x == 1))
                    res++;
                map.merge(s.charAt(i), 1, (o, n) -> o - n);
            }
            return res;
        }
    }
}
