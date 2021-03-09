package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/3/9 14:04
 */
public class Q572 {
    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看
//做它自身的一棵子树。
//
// 示例 1:
//给定的树 s:
//
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//
//
// 给定的树 t：
//
//
//   4
//  / \
// 1   2
//
//
// 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
//
// 示例 2:
//给定的树 s：
//
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
//
//
// 给定的树 t：
//
//
//   4
//  / \
// 1   2
//
//
// 返回 false。
// Related Topics 树
// 👍 458 👎 0


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
        public boolean isSubtree(TreeNode s, TreeNode t) {
            return tr(s, t);
        }

        boolean tr(TreeNode root, TreeNode root2) {
            if (root == null) {
                return false;
            }

            if(is(root, root2)) {
                return true;
            }

            if(tr(root.left, root2)) {
                return true;
            }

            return tr(root.right, root2);
        }

        boolean is(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) {
                return true;
            }

            if (root1 == null) {
                return false;
            }

            if (root2 == null) {
                return false;
            }

            if (root1.val != root2.val) {
                return false;
            }

            if(!is(root1.left, root2.left)) {
                return false;
            }

            return is(root1.right, root2.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
