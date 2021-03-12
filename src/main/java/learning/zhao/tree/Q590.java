package learning.zhao.tree;

import learning.zhao.material.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaozhifeng10
 * @since 2021/3/11 18:15
 */
public class Q590 {
    //给定一个 N 叉树，返回其节点值的 后序遍历 。
//
// N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
//
//
//
//
//
// 进阶：
//
// 递归法很简单，你可以使用迭代法完成此题吗?
//
//
//
// 示例 1：
//
//
//
//
//输入：root = [1,null,3,2,4,null,5,6]
//输出：[5,6,3,2,4,1]
//
//
// 示例 2：
//
//
//
//
//输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,
//null,13,null,null,14]
//输出：[2,6,14,11,7,3,12,8,4,13,9,10,5,1]
//
//
//
//
// 提示：
//
//
// N 叉树的高度小于或等于 1000
// 节点总数在范围 [0, 10^4] 内
//
//
//
// Related Topics 树
// 👍 130 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


    static class Solution {
        List<Integer> ret = new ArrayList<>();
        public List<Integer> postorder(Node root) {
            x(root);
            return ret;
        }

        void x(Node root) {
            if (root == null) {
                return;
            }

            for (Node c: root.children) {
                x(c);
            }
            ret.add(root.val);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
