package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/3/4 20:56
 */
public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return s(nums, 0, nums.length - 1);
    }

    int midIndex(int[] nums, int bg, int end) {
        return (bg + end)/2;
    }

    TreeNode s(int[] nums, int bg, int end) {
        TreeNode root = new TreeNode();
        if(bg > end) {
            return null;
        }

        int mid = midIndex(nums, bg, end);
        root.val = nums[mid];

        TreeNode left = s(nums, bg, mid - 1);
        TreeNode right = s(nums, mid + 1, end);
        root.left = left;
        root.right = right;
        return root;
    }
}
