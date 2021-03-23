package learning.zhao.dp;

/**
 * @author zhaozhifeng10
 * @since 2021/3/23 10:24
 */
public class Q392 {
//给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
//
// 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"ae
//c"不是）。
//
// 进阶：
//
// 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代
//码？
//
// 致谢：
//
// 特别感谢 @pbrother 添加此问题并且创建所有测试用例。
//
//
//
// 示例 1：
//
//
//输入：s = "abc", t = "ahbgdc"
//输出：true
//
//
// 示例 2：
//
//
//输入：s = "axc", t = "ahbgdc"
//输出：false
//
//
//
//
// 提示：
//
//
// 0 <= s.length <= 100
// 0 <= t.length <= 10^4
// 两个字符串都只由小写字符组成。
//
// Related Topics 贪心算法 二分查找 动态规划
// 👍 409 👎 0


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();

//        return is(s1, s1.length - 1, t1, t1.length - 1);
            return  isSub(s1, t1);
        }


        boolean is(char[] a, int ax, char[] b, int by) {
            if (ax < 0) {
                return true;
            }

            if (ax >= 0 && by < 0) {
                return false;
            }

            if (by < 0) {
                return false;
            }

            if (a[ax] == b[by]) {
                return is(a, ax - 1, b, by - 1);
            }

            return is(a, ax, b, by - 1);
        }

        boolean isSub(char[] a, char[] b) {
            boolean[][] dp = new boolean[a.length + 2][b.length + 2];
            for (int i = 0; i <= b.length; i ++) {
                dp[0][i] = true;
            }

            for (int i = 1; i <= a.length; i++) {
                dp[i][0] = false;
            }

            for (int i = 0; i < a.length; i ++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        dp[i + 1][j + 1] = dp[i][j];
                    }
                    else{
                        dp[i + 1][j + 1] = dp[i + 1][j];
                    }
                }
            }

            return dp[a.length][b.length];
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
