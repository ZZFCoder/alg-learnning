class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ret = Integer.MAX_VALUE;
        for (int l = 0, r = 0, sum = 0; r < nums.length; r++) {
            sum += nums[r];
            while(sum >= target) {
                ret = Math.min(ret, r - l + 1);
                sum -= nums[l++];
            }
        }

        return ret == Integer.MAX_VALUE ? 0: ret;
    }
}