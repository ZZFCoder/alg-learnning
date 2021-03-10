package learning.zhao.tree;

import learning.zhao.material.TreeNode;

public class Q653 {
//给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
//
// 案例 1:
//
//
//输入:
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 9
//
//输出: True
//
//
//
//
// 案例 2:
//
//
//输入:
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 28
//
//输出: False
//
//
//
// Related Topics 树
// 👍 224 👎 0


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
        public boolean findTarget(TreeNode root, int k) {
            return findx(root, root, k);
        }

        boolean findx(TreeNode root1, TreeNode root2, int k) {
            if (root1 == null) {
                return false;
            }

            if(findTa(root1.val, root2, k)) {
                return true;
            }

            if(findx(root1.left, root2, k)) {
                return true;
            }

            return findx(root1.right, root2, k);

        }

        boolean findTa(Integer a, TreeNode root, int k) {
            if (a == k - a) {
                return false;
            }

            if(find(root, k - a)) {
                return true;
            }

            return find(root, k - a);
        }

        boolean find(TreeNode root, int t) {
            if (root == null) {
                return false;
            }

            if (root.val == t) {
                return true;
            }

            if (root.val < t) {
                return find(root.right, t);
            }

            return find(root.left, t);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
