package learning.zhao.list;

public class Q27 {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i++] = nums[j];
                }
            }
            return i;
        }
    }
}
