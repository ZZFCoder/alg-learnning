/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        tra(root);
        return root;
    }

    void tra(TreeNode node) {
        if (node == null) {
            return;
        }

        tra(node.left);
        tra(node.right);
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
    }
}
// @lc code=end

