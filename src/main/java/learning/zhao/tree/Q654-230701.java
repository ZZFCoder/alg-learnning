class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return cons(nums, 0, nums.length - 1);
    }

    TreeNode cons(int[] nums, int b, int e) {
        if (b > e) {
            return null;
        }

        int maxIdx = findMaxIdx(nums, b, e);
        int rootVal = nums[maxIdx];
        TreeNode root = new TreeNode(rootVal);
        root.left = cons(nums, b, maxIdx - 1);
        root.right = cons(nums, maxIdx + 1, e);
        return root;
    }

    int findMaxIdx(int[] n, int b, int e) {
        int maxIdx = b;
        for (int i = b; i <= e; i++) {
            if (n[maxIdx] < n[i]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}