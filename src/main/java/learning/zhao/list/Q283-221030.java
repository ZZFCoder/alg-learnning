/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int cur = 0;
        for (int iter = 0; iter < nums.length; iter++) {
            if (nums[iter] != 0) {
                if (cur != iter) {
                    nums[cur++] = nums[iter];
                    nums[iter] = 0;
                }
                else {
                    cur++;
                }
            }
        }
    }
}
// @lc code=end

