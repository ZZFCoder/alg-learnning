/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }

        for (int j = 1; j <= len2; j++) {
            dp[0][j] = j;
        }

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                    dp[i+1][j+1] = Math.min(dp[i][j], Math.min(dp[i][j+1], dp[i+1][j]));
            }
        }

        return dp[word1.length()][word2.length()];
    }
}
// @lc code=end

