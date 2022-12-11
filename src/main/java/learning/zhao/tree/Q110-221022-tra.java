/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        dep(root);
        return balanced;
    }

    int dep(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dep(node.left);
        int right = dep(node.right);

        if (Math.abs(left - right) > 1) {
            balanced = false;
        }
        
        return 1 + Math.max(left, right);
    }
}
// @lc code=end

