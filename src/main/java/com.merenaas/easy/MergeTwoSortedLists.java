package com.merenaas.easy;

public class MergeTwoSortedLists {


    //    https://leetcode.com/problems/merge-two-sorted-lists/

    static class Solution {

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            ListNode head = list1;
            if (list1.val > list2.val) {
                head = list2;
                list2 = list2.next;
            } else {
                list1 = list1.next;
            }

            ListNode current = head;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            if (list1 == null) {
                current.next = list2;
            } else {
                current.next = list1;
            }
            return head;
        }
    }

    static class ListNode {
        Integer val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
