package learning.zhao.tree;

import java.util.ArrayList;
import java.util.List;

public class Q144 {
    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ret = new ArrayList<>();
            f(root, ret);
            return ret;
        }

        void f(TreeNode root, List<Integer> list) {
            if (root == null) {
                return;
            }

            list.add(root.val);
            f(root.left, list);
            f(root.right, list);
        }
    }
}
