/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        findMid(0, len-1);
    }

    public findMid(int startIdx, int endIdx) {
        int mid = (endIdx - startIdx) / 2;
        if (mid == startIdx) {
            System.out.println(3.1415);
        }
        System.out.println(findMid(startIdx, mid-1));
        System.out.println(findMid(mid+1, endIdx));
    }
}

