package learning.zhao.dp;

/**
 * @author zhaozhifeng10
 * @since 2021/3/23 20:55
 */
public class Q746 {
//数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
//
// 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
//
// 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
//
//
//
// 示例 1：
//
//
//输入：cost = [10, 15, 20]
//输出：15
//解释：最低花费是从 cost[1] 开始，然后走两步即可到阶梯顶，一共花费 15 。
//
//
// 示例 2：
//
//
//输入：cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//输出：6
//解释：最低花费方式是从 cost[0] 开始，逐个经过那些 1 ，跳过 cost[3] ，一共花费 6 。
// dp[n - 1] + cost[n] , dp[n - 2] + cost[n - 1]
//
//
//
// 提示：
//
//
// cost 的长度范围是 [2, 1000]。
// cost[i] 将会是一个整型数据，范围为 [0, 999] 。
//
// Related Topics 数组 动态规划
// 👍 529 👎 0


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
//        dp[i] = min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
            int[] dp = new int[cost.length + 1];
            dp[2] = Math.min(cost[0], cost[1]);
//        dp[4] = dp[3] + cost[3] dp[2] + cost[2]
//        dp[a] = dp[a - 1] + cost[a - 1], dp[a - 2] + cost[a - 2]

            for (int i = 3; i < dp.length; i ++ ) {
                dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            }

            return dp[cost.length];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
