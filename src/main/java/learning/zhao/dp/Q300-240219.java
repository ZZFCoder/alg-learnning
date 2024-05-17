/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for(int i = 1; i < len; i++) {
            for(int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int ret = 0;
        for(int i = 0; i < len; i++) {
            ret = Math.max(ret, dp[i]);
        }

        return ret;
    }
}
// @lc code=end

