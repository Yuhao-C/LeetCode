import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {return true;}
        boolean isSymmetric = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while (!q.isEmpty()) {
            TreeNode q1 = q.poll();
            TreeNode q2 = q.poll();
            if (q1 == null && q2 == null) {
                continue;
            } else if (q1 == null || q2 == null) {
                isSymmetric = false;
                break;
            } else if (q1.val != q2.val) {
                isSymmetric = false;
                break;
            }
            q.add(q1.left);
            q.add(q2.right);
            q.add(q1.right);
            q.add(q2.left);
        }
        return isSymmetric;
    }
}

