import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        boolean isSameTree = true;
        LinkedList<TreeNode> pTree = new LinkedList<>();
        LinkedList<TreeNode> qTree = new LinkedList<>();
        pTree.add(p);
        qTree.add(q);
        while (qTree.size() != 0) {
            TreeNode currentP = pTree.pop();
            TreeNode currentQ = qTree.pop();
            if ((currentP == null) != (currentQ == null)) {
                isSameTree = false;
                break;
            } else {
                if (currentP.val != currentQ.val) {
                    isSameTree = false;
                    break;
                } else {
                    if (currentP.left != null || currentQ.left != null) {
                        pTree.add(currentP.left);
                        qTree.add(currentQ.left);
                    }
                    if (currentP.right != null || currentQ.right != null) {
                        pTree.add(currentP.right);
                        qTree.add(currentQ.right);
                    }
                }
            }
        }
        return isSameTree;
    }
}

