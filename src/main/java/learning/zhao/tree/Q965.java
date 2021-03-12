package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/3/12 19:57
 */
public class Q965 {
    //如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
//
// 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
//
//
//
// 示例 1：
//
//
//
// 输入：[1,1,1,1,1,null,1]
//输出：true
//
//
// 示例 2：
//
//
//
// 输入：[2,2,2,5,2]
//输出：false
//
//
//
//
// 提示：
//
//
// 给定树的节点数范围是 [1, 100]。
// 每个节点的值都是整数，范围为 [0, 99] 。
//
// Related Topics 树
// 👍 72 👎 0


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
        int start = 0;
        public boolean isUnivalTree(TreeNode root) {
            return tr(root);
        }

        boolean tr(TreeNode root) {
            if (root == null) {
                return true;
            }

            if (start != 0) {
                if (start != root.val) {
                    return false;
                }
            }

            if (start == 0) {
                start = root.val;
            }

            if(!tr(root.left)) {
                return false;
            }

            return tr(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
