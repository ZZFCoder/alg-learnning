package learning.zhao.material;

import java.util.List;

/**
 * @author zhaozhifeng10
 * @since 2021/2/8 15:26
 */
public class Node {
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
