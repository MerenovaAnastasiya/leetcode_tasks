package com.merenaas.easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.isValid("(("));
    }


    static class Solution {
        public boolean isValid(String s) {
            var stack = new Stack<Character>();
            if (s.length() % 2 != 0 ) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                var character = s.charAt(i);
                if (character != '{' && character != '[' && character != '(') {
                    if (stack.empty()) {
                        return false;
                    }
                    var characterFromStack = stack.pop();
                    switch (characterFromStack) {
                        case '{':
                            if (character != '}')
                                return false;
                            break;
                        case '(':
                            if (character != ')')
                                return false;
                            break;
                        case '[':
                            if (character != ']')
                                return false;
                            break;
                    }
                } else stack.push(character);
            }
            return stack.empty();
        }
    }
}
