import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        result.add(new ArrayList<>());
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int layer = 0;
        int count = 0;
        int numElement = 1;
        int numNull = 0;
        while (true) {
            if (count == numElement) {
                numElement = numElement * 2 - numNull;
                if (numElement == 0) break;
                count = 0;
                numNull = 0;
                layer++;
                result.add(new ArrayList<>());
            }
            TreeNode currentNode = q.poll();
            result.get(layer).add(currentNode.val);
            if (currentNode.left == null) {
                numNull++;
            } else {
                q.add(currentNode.left);
            }
            if (currentNode.right == null) {
                numNull++;
            } else {
                q.add(currentNode.right);
            }
            count++;
        }
        Collections.reverse(result);
        return result;
    }
}
