package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/2/8 15:02
 */
public class ReverseBTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode right = invertTree(root.left);
        TreeNode left = invertTree(root.right);
        root.right = right;
        root.left = left;
        return root;
    }

    public static void main(String[] args) {

    }


}
