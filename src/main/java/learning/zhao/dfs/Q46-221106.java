/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        traverse(nums, track);
        return ret;
    }

    void traverse(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            ret.add(new LinkedList(track));
            return;
        }

        for (int i : nums) {
            if (track.contains(i)) {
                continue;
            }
            track.add(i);
            traverse(nums, track);
            track.removeLast();
        }
    }
}
// @lc code=end

