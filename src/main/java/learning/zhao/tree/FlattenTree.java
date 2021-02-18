package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/2/8 16:39
 */
public class FlattenTree {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.right = left;
        root.left = null;

        TreeNode end = root;
        while (end.right != null) {
            end = end.right;
        }

        end = right;
    }

    private TreeNode f(TreeNode node) {
        if (node == null) {
            return null;
        }

        flatten(node);
        TreeNode end = node;
        while (node.right != null) {
            end = end.right;
        }
        return end;
    }
}
