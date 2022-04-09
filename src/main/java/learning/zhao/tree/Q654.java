package learning.zhao.tree;

public class Q654 {
    static class Solution {

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return f(nums, 0, nums.length - 1);
        }

        TreeNode f(int[] nums, int bg, int end) {
            if(nums.length == 0) {
                return null;
            }

            if(bg > end) {
                return null;
            }

            int maxIdx = find(nums, bg, end);
            TreeNode root = new TreeNode();
            root.val = nums[maxIdx];
            root.left = f(nums, bg, maxIdx - 1);
            root.right = f(nums, maxIdx + 1, end);
            return root;
        }

        int find(int[] nums, int bg, int end) {
            int ret = bg;
            for(int i = bg; i <= end; i++) {
                if(nums[ret] < nums[i]) {
                    ret = i;
                }
            }
            return ret;
        }
    }
}
