/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        if (head == null) {
            return head;    
        }
        ListNode thisNode = head.next;
        while (thisNode != null) {
            if (thisNode.val == currentNode.val) {
                currentNode.next = thisNode.next;
            } else {
                currentNode = thisNode;
            }
            thisNode = thisNode.next;
        }
        return head;
    }
}

