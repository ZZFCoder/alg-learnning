package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @program alg-learnning
 * @description 114
 * @since 2021/10/26 14:19
 */
public class Q114 {
    static class Solution {
        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }

            flatten(root.left);
            flatten(root.right);
            TreeNode right1 = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode tmp = root;
            while(tmp.right != null) {
                tmp = tmp.right;
            }

            tmp.right = right1;
        }
    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode newRtChild = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode tmp = root;
        while(tmp.right != null) {
            tmp = tmp.right;
        }
        //tmp = newRtChild !!! wrong
        tmp.right = newRtChild;
    }
}