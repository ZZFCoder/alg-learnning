package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/3/12 18:15
 */
public class Q938 {
    //给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
//
//
//
// 示例 1：
//             10
//          5    15
//        3  7     18
//
//输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
//输出：32
//
//
// 示例 2：
//
//
//输入：root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
//输出：23
//
//
//
//
// 提示：
//
//
// 树中节点数目在范围 [1, 2 * 104] 内
// 1 <= Node.val <= 105
// 1 <= low <= high <= 105
// 所有 Node.val 互不相同
//
// Related Topics 树 深度优先搜索 递归
// 👍 161 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
    static class Solution {
        int sum = 0;
        public int rangeSumBST(TreeNode root, int low, int high) {
            tr1(root, low, high);
            return sum;
        }

        void tr(TreeNode root, int low, int high) {
            if (root == null) {
                return;
            }

            tr(root.left, low, high);
            if (low <= root.val && root.val <= high) {
                sum += root.val;
            }

            if (root.val > high) {
                return;
            }

            tr(root.right, low, high);
        }

        void tr1(TreeNode root, int low, int high) {
            if (root == null) {
                return;
            }


            if (root.val < low) {
                tr1(root.right, low, high);
            }

            if (root.val > high) {
                tr1(root.left, low, high);
            }

            if (root.val >= low && root.val <= high) {
                sum += root.val;
                tr1(root.left, low, high);
                tr1(root.right, low, high);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
