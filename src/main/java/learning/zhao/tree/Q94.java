package learning.zhao.tree;

import java.util.ArrayList;
import java.util.List;

public class Q94 {

    public static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ret = new ArrayList<>();
            f(root, ret);
            return ret;
        }

        void f(TreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }

            f(root.left, list);
            list.add(root.val);
            f(root.right, list);
        }
    }
}
