package com.merenaas.easy;

public class FirstBadVersion {

//    https://leetcode.com/problems/first-bad-version/

    public class Solution {
        public int firstBadVersion(int n) {
//         версии могут принимать значения от 1 до n, если 1-я плохая, то все остальные тоже
            int start = 1;
            while(start <= n) {
                int mid = start + (n - start) / 2;
                if(isBadVersion(mid)) {
                    n = mid - 1;
                } else {
                    start = mid + 1;
                }
            } return start;
        }

        private boolean isBadVersion(int mid) {
            return true;
        }
    }
}
