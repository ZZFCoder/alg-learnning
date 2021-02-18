package learning.zhao.tree;

import learning.zhao.material.Node;

/**
 * @author zhaozhifeng10
 * @since 2021/2/8 15:26
 */
public class FillNextOfTreeNode {
    public Node connect(Node root) {
        fillNext(root.left, root.right);
        return root;
    }

    public void fillNext(Node node1, Node node2) {
        if (node1 == null || node1.left == null) {
            return;
        }

        node1.next = node2;
        fillNext(node1.left, node1.right);
        fillNext(node2.left, node2.right);
        fillNext(node1.right, node2.left);
    }
}
