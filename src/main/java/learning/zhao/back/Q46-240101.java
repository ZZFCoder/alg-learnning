/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> track = new LinkedList<>();
        backtrack(track, nums);
        return ret;
    }

    void backtrack(List<Integer> track, int[] nums) {
        if (track.size() == nums.length) {
            ret.add(new LinkedList<>(track));
            return;
        }

        for (int i : nums) {
            if (track.contains(i)) {
                continue;
            }

            track.add(i);
            backtrack(track, nums);
            track.removeLast();
        }
    }
}
// @lc code=end

