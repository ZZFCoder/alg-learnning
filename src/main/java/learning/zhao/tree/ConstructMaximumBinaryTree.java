package learning.zhao.tree;

import learning.zhao.material.TreeNode;

/**
 * @author zhaozhifeng10
 * @since 2021/2/8 17:35
 */
public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            TreeNode ret = new TreeNode();
            ret.val = nums[0];
            return ret;
        }

        int maxIndex = findMaxIndex(nums, 0, nums.length - 1);
        TreeNode left = cons(nums, 0, maxIndex - 1);
        TreeNode right = cons(nums, maxIndex + 1, nums.length - 1);
        TreeNode root = new TreeNode();
        root.val = nums[nums[maxIndex]];
        root.left = left;
        root.right = right;
        return root;
    }

    private TreeNode cons(int[] nums, int beg, int end) {
        if (beg > end) {
            return null;
        }

        if (beg == end) {
            TreeNode ret = new TreeNode();
            ret.val = nums[beg];
            return ret;
        }

        int maxIndex = findMaxIndex(nums, beg, end);
        TreeNode left = cons(nums, beg, maxIndex);
        TreeNode right = cons(nums, maxIndex, end);
        TreeNode node = new TreeNode();
        node.val = nums[maxIndex];
        node.left = left;
        node.right = right;
        return node;
    }

    private int findMaxIndex(int[] nums, int bg, int end) {
        int max = nums[bg];
        int retIndex = bg;
        for (int i = bg + 1; i <= end; i++) {
            if (max < nums[i]) {
                max = nums[i];
                retIndex = i;
            }
        }

        return retIndex;
    }


}
