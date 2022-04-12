package learning.zhao.tree;

public class Q105 {
    static class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return buildTree1(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        TreeNode buildTree1(int[] pre, int preBgIdx, int preEdIdx, int[] in, int inBgIdx, int inEdIdx) {
            if (preBgIdx > preEdIdx || inBgIdx > inEdIdx) {
                return null;
            }

            TreeNode root = new TreeNode();
            root.val = pre[preBgIdx];
            int rootIdxOfIn = findRoot(in, pre[preBgIdx]);
            root.left = buildTree1(pre, preBgIdx + 1, preBgIdx + (rootIdxOfIn - inBgIdx), in, inBgIdx, rootIdxOfIn - 1);
            root.right = buildTree1(pre, preBgIdx + (rootIdxOfIn - inBgIdx) + 1, preEdIdx, in, rootIdxOfIn + 1, inEdIdx);
            return root;
        }

        int findRoot(int[] in, int root) {
            for(int i = 0; i < in.length; i++) {
                if (in[i] == root) {
                    return i;
                }
            }
            return 0;
        }
    }
}
