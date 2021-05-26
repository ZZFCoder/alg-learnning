package learning.zhao.tree;

import learning.zhao.material.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q501 {
    //给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
//
// 假定 BST 有如下定义：
//
//
// 结点左子树中所含结点的值小于等于当前结点的值
// 结点右子树中所含结点的值大于等于当前结点的值
// 左子树和右子树都是二叉搜索树
//
//
// 例如：
//给定 BST [1,null,2,2],
//
//    1
//    \
//     2
//    /
//   2
//
//
// 返回[2].
//
// 提示：如果众数超过1个，不需考虑输出顺序
//
// 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
// Related Topics 树
// 👍 276 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    static class Solution {
        List<Integer> retL = new ArrayList<>();
        Integer pre = null;
        int count = 0;
        int max = 0;
        public int[] findMode(TreeNode root) {
            find(root);
            int[] r = new int[retL.size()];
            for(int i = 0; i < retL.size(); i ++) {
                r[i] = retL.get(i);
            }
            return r;
        }

        void find(TreeNode root) {
            if (root == null) {
                return;
            }

            find(root.left);
            if(pre != null && pre == root.val) {
                ++ count;
            }
            else {
                count = 0;
                pre = root.val;
            }

            if(max == count && !retL.contains(root.val)) retL.add(root.val);
            if(count > max) {
                retL.clear();
                retL.add(root.val);
                max = count;
            }
            find(root.right);
        }
    }

    //给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
//
// 假定 BST 有如下定义：
//
//
// 结点左子树中所含结点的值小于等于当前结点的值
// 结点右子树中所含结点的值大于等于当前结点的值
// 左子树和右子树都是二叉搜索树
//
//
// 例如：
//给定 BST [1,null,2,2],
//
//    1
//    \
//     2
//    /
//   2
//
//
// 返回[2].
//
// 提示：如果众数超过1个，不需考虑输出顺序
//
// 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
// Related Topics 树
// 👍 306 👎 0


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
    static class Solution2 {
        List<Integer> ret = new ArrayList<>();
        int pre = -1;
        int max = 1;
        int count = 0;
        public int[] findMode(TreeNode root) {
            find1(root);

            int[] retArr = new int[ret.size()];
            for (int i = 0; i < ret.size(); i++) {
                retArr[i] = ret.get(i);
            }
            return retArr;
        }

        void find1(TreeNode root) {
            if (root == null) {
                return;
            }

            find1(root.left);
            if (root.val != pre && pre != -1) {
                count = 1;
                pre = root.val;
                if (count == max) {
                    ret.add(root.val);
                }
            }
            else if (pre == -1 || root.val == pre) {
                count ++;
                if (count == max) {
                    ret.add(root.val);
                }

                if (count > max) {
                    ret.clear();
                    ret.add(root.val);
                    max = count;
                }

                pre = root.val;
            }

            find1(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

//leetcode submit region end(Prohibit modification and deletion)

}
