class Solution {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return ret;
    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        ret.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}