package com.yl.leetcode.easy.aug22;

/**
 * @author Lei
 * @version 1.0
 * @date 2022/8/23 - 08 - 23 - 23:31
 * @Description Palindrome Linked List
 * Given the head of a singly linked list, return true if it is a palindrome.
 */

class ListNode {
    int val;
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

public class LC234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = slow;
        slow = slow.next;
        // the sequence matters
        prev.next = null;
        ListNode temp;

        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

}


