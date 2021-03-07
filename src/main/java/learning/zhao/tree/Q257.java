package learning.zhao.tree;

import learning.zhao.material.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class Q257 {
    //给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例:
//
// 输入:
//
//   1
// /   \
//2     3
// \
//  5
//
//输出: ["1->2->5", "1->3"]
//
//解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
// Related Topics 树 深度优先搜索
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
        List<String> ret = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {
            if (root == null) {
                return ret;
            }

            if (root.left == null && root.right == null) {
                ret.add(root.val + "");
                return ret;
            }
            bi(root.left, root.val + "");
            bi(root.right, root.val + "");
            return ret;
        }

        void bi(TreeNode root, String path) {
            if(root == null) {
                return;
            }
            path += ("->" + root.val);
            if(root.left == null && root.right == null) {
                ret.add(path);
            }

            bi(root.left, path);
            bi(root.right, path);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
