package learning.zhao.tree;

import learning.zhao.material.TreeNode;

public class Q404 {
    //计算给定二叉树的所有左叶子之和。
//
// 示例：
//
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
//
//
// Related Topics 树
// 👍 289 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int leftSum = 0;
            if(root.left != null && root.left.left == null && root.left.right == null) {
                leftSum += root.left.val;
            }

            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + leftSum;
        }
    }

    static class Solution1 {
        int ret = 0;
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) {
                return ret;
            }

            if (root.left != null) {
                if (root.left.left == null && root.left.right == null) {
                    ret += root.left.val;
                }
                else {
                    sumOfLeftLeaves(root.left);
                }
            }

            sumOfLeftLeaves(root.right);
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
