package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/3/8 14:28
 */
public class Q543 {
    //给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
//
//
//
// 示例 :
//给定二叉树
//
//           1
//         / \
//        2   3
//       / \
//      4   5
//
//
// 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
//
//
//
// 注意：两结点之间的路径长度是以它们之间边的数目表示。
// Related Topics 树
// 👍 634 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    static class Solution {
        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) return max;
            tr(root);
            return max;
        }

        void tr(TreeNode root) {
            if (root == null) {
                return;
            }
            int de = depAdd(root);
            if (max < de) {
                max = de;
            }
            tr(root.left);
            tr(root.right);
        }

        int depAdd(TreeNode root) {
            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) {
                return 0;
            }

            return dep(root.left) + dep(root.right);
        }

        int dep(TreeNode root) {
            if (root == null) {
                return 0;
            }

            return Math.max(dep(root.left), dep(root.right)) + 1;
        }

    }

    static class Solution2 {
        int ret = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null || (root.left == null && root.right == null)) {
                return 0;
            }

            maxDepth(root);
            return ret;
        }

        int maxDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            ret = Math.max(ret, left + right);

            return 1 + Math.max(left, right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
