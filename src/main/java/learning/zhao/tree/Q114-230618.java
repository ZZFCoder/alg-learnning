class Solution {
    public void flatten(TreeNode root) {
        traverse(root);
    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        traverse(root.right);
        
        if (root.left != null) {
            TreeNode right = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode x = root.right;
            while(x.right != null) {
                x = x.right;
            }
            x.right = right;
        }
    }
}