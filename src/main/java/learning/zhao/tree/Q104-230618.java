class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

class Solution {
    int dep = 0;
    int ret = 0;
    public int maxDepth(TreeNode root) {
        traverse(root);
        return ret;
    }

    void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        ret = Math.max(ret, ++dep);
        traverse(node.left);
        traverse(node.right);
        dep--;
    }
}