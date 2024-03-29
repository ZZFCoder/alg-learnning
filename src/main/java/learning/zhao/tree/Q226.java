package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @date 2021/5/19 9:33
 * @description
 */
public class Q226 {
    //翻转一棵二叉树。
//
// 示例：
//
// 输入：
//
//      4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//
// 输出：
//
//      4
//   /   \
//  7     2
// / \   / \
//9   6 3   1
//
// 备注:
//这个问题是受到 Max Howell 的 原问题 启发的 ：
//
// 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
// Related Topics 树
// 👍 857 👎 0


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
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            TreeNode left = invertTree(root.right);
            TreeNode right = invertTree(root.left);

            root.left = left;
            root.right = right;
            return root;
        }

        public TreeNode invertTree2(TreeNode root) {
            if (root == null) {
                return null;
            }

            TreeNode right = invertTree(root.left);
            TreeNode left = invertTree(root.right);
            root.left = left;
            root.right = right;
            return root;
        }
    }

    private static class Solution2 {
        public TreeNode invertTree(TreeNode root) {
            if(root == null) {
                return null;
            }

            TreeNode newR = invertTree(root.left);
            TreeNode newL = invertTree(root.right);
            root.right = newR;
            root.left = newL;
            return root;
        }
        public TreeNode invertTreeWrong(TreeNode root) {
            if(root == null) {
                return null;
            }

            //root直接被改了....
            root.right = invertTree(root.left);
            root.left = invertTree(root.right);
            return root;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
