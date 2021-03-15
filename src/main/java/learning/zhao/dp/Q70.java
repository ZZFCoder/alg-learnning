package learning.zhao.dp;

/**
 * @author zhaozhifeng10
 * @since 2021/3/15 18:08
 */
public class Q70 {
    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划
// 👍 1532 👎 0


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int climbStairs(int n) {
            int pre1 = 0;
            int pre2 = 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    pre1 = 1;
                    pre2 = 0;
                }
                if (i == 2) {
                    pre1 = 2;
                    pre2 = 0;
                }

                if (i == 3) {
                    pre1 = 2;
                    pre2 = 1;
                }

                sum = pre1 + pre2;
                pre2 = pre1;
                pre1 = sum;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
