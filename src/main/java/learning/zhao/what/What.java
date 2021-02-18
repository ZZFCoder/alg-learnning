package learning.zhao.what;

/**
 * @author zhaozhifeng10
 * @since 2021/2/7 19:32
 */
public class What {
    public static void main(String[] args) {

    }

    public boolean f(int[] nums) {
        int changeTime = 0;
        if (nums.length == 1) {
            return true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 >= nums.length) {
                continue;
            }

            if (nums[i] > nums[i + 1]) {
                changeTime ++;
                if (changeTime >= 2) {
                    return false;
                }

                if (i - 1 >= 0 && nums[i -1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                    continue;
                }
            }
        }

        return true;
    }
}
