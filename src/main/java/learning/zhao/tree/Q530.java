package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/3/8 13:44
 */
public class Q530 {
    //给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
//
//
//
// 示例：
//
// 输入：
//
//   1
//    \
//     3
//    /
//   2
//
//输出：
//1
//
//解释：
//最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
//
//
//
//
// 提示：
//
//
// 树中至少有 2 个节点。
// 本题与 783 https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
//相同
//
// Related Topics 树
// 👍 235 👎 0


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
        Integer pre = null;
        int s = Integer.MAX_VALUE;
        public int getMinimumDifference(TreeNode root) {
            tr(root);
            return s;
        }

        void tr(TreeNode root) {
            if(root == null) {
                return;
            }
            tr(root.left);
            if(pre != null) {
                s = Math.min(s, root.val - pre);
            }
            pre = root.val;
            tr(root.right);
        }
    }

    static class Solution1 {
        int pre = -1;
        int ret = Integer.MAX_VALUE;
        public int getMinimumDifference(TreeNode root) {
            tr(root);
            return ret;
        }

        void tr(TreeNode root) {
            if (root == null) {
                return;
            }

            tr(root.left);
            if (pre != -1) {
                ret = Math.min(Math.abs(root.val - pre), ret);
            }
            pre = root.val;
            tr(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
