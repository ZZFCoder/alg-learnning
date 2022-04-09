package learning.zhao.tree;

import java.util.ArrayList;
import java.util.List;

public class Q102 {
    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ret = new ArrayList<>();
            f(root, ret, 1);
            return ret;
        }

        void f(TreeNode root, List<List<Integer>> ret, int i) {
            if (root == null) {
                return;
            }

            if (ret.size() < i) {
                ret.add(new ArrayList<>());
            }

            ret.get(i - 1).add(root.val);
            f(root.left, ret, i + 1);
            f(root.right, ret, i + 1);
        }
    }
}
