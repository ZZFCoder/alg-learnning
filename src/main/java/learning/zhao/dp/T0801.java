package learning.zhao.dp;

/**
 * @author zhaozhifeng10
 * @since 2021/3/24 14:02
 */
public class T0801 {
    //三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模100
//0000007。
//
// 示例1:
//
//
// 输入：n = 3
// 输出：4
// 说明: 有四种走法
//
//
// 示例2:
//
//
// 输入：n = 5
// 输出：13
//
//
// 提示:
//
//
// n范围在[1, 1000000]之间
//
// Related Topics 动态规划
// 👍 48 👎 0


    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int waysToStep(int n) {
            if (n == 1) {
                return 1;
            }

            if (n == 2) {
                return 2;
            }

            if (n == 3) {
                return 4;
            }
            int dp_n_1 = 4;
            int dp_n_2 = 2;
            int dp_n_3 = 1;

            for (int i = 4; i <= n; i ++) {
                int tmp = dp_n_1;
                dp_n_1 = (dp_n_3 + (dp_n_2 + dp_n_1)%1000000007)%1000000007;
                dp_n_3 = dp_n_2;
                dp_n_2 = tmp;
            }
            return dp_n_1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}