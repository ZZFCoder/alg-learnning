class Solution {
    int ret = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ret;
    }

    int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftC = depth(root.left);
        int rightC = depth(root.right);
        ret = Math.max(ret, leftC + rightC);
        return 1 + Math.max(leftC, rightC);
    }
}