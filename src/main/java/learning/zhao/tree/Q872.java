package learning.zhao.tree;

import learning.zhao.material.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaozhifeng10
 * @since 2021/3/12 13:46
 */
public class Q872 {
    //请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
//
//
//
// 举个例子，如上图所示，给定一棵叶值序列为 (6, 7, 4, 9, 8) 的树。
//
// 如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
//
// 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
//
//
//
// 示例 1：
//
//
//
// 输入：root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,nu
//ll,null,null,null,9,8]
//输出：true
//
//
// 示例 2：
//
// 输入：root1 = [1], root2 = [1]
//输出：true
//
//
// 示例 3：
//
// 输入：root1 = [1], root2 = [2]
//输出：false
//
//
// 示例 4：
//
// 输入：root1 = [1,2], root2 = [2,2]
//输出：true
//
//
// 示例 5：
//
//
//
// 输入：root1 = [1,2,3], root2 = [1,3,2]
//输出：false
//
//
//
//
// 提示：
//
//
// 给定的两棵树可能会有 1 到 200 个结点。
// 给定的两棵树上的值介于 0 到 200 之间。
//
// Related Topics 树 深度优先搜索
// 👍 95 👎 0


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

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int a = 0;
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) {
                return false;
            }

            if (root1 == null || root2 == null) {
                return false;
            }

            tr(root1);
            tr1(root2);
            return l1.size() == a;
        }

        void tr(TreeNode root) {
            if (root == null) {
                return;
            }

            if (root.left == null && root.right == null) {
                l1.add(root.val);
            }
            tr(root.left);
            tr(root.right);
        }

        void tr1(TreeNode root) {
            if (root == null) {
                return;
            }

            if (root.left == null && root.right == null) {
                if (a < l1.size() && l1.get(a) != root.val) {
                    return;
                }
                ++ a;
            }

            tr1(root.left);
            tr1(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
