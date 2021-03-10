package learning.zhao.tree;

import learning.zhao.material.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaozhifeng10
 * @since 2021/3/10 13:46
 */
public class Q637 {//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
//
//
//
// 示例 1：
//
// 输入：
//    3
//   / \
//  9  20
//    /  \
//   15   7
//输出：[3, 14.5, 11]
//解释：
//第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
//
//
//
//
// 提示：
//
//
// 节点值的范围在32位有符号整数范围内。
//
// Related Topics 树
// 👍 242 👎 0


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
        List<Double> ret = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        public List<Double> averageOfLevels(TreeNode root) {
            a(root, 0);
            for (int i = 0; i < ret.size(); i++) {
                ret.set(i, ret.get(i)/count.get(i));
            }
            return ret;
        }

        void a(TreeNode root, int level) {
            if (root == null) {
                return;
            }

            if (ret.size() < level + 1) {
                ret.add(0.00 + root.val);
                count.add(1);
            }
            else {
                ret.set(level, (ret.get(level) + root.val));
                count.set(level, count.get(level) + 1);
            }


            a(root.left, level + 1);
            a(root.right, level + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
