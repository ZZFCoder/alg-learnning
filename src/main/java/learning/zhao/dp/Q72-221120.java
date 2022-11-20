/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        return minD(word1, word1.length(), word2, word2.length());
    }

    int minD(String s1, int len1, String s2, int len2) {
        if (len1 == 0) {
            return len2;
        }

        if (len2 == 0) {
            return len1;
        }

        if (s1.charAt(len1 - 1) == s2.charAt(len2 - 1)) {
            return minD(s1, len1 - 1, s2, len2 - 1);
        }
        else {
            return Math.min(minD(s1, len1 - 1, s2, len2) + 1, 
                Math.min(minD(s1, len1, s2, len2 - 1) + 1,
                    minD(s1, len1 - 1, s2, len2 - 1) + 1)
            );
        }
    }
}
// @lc code=end

