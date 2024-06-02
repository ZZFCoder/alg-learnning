class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sArr = s.toCharArray();
        int[] stats = new int[256];
        int ret = 0;
        Arrays.fill(stats, -1);
        for (int l = 0, r = 0; r < sArr.length; r++) {
            l = Math.max(l,stats[sArr[r]] + 1);
            stats[sArr[r]] = r;
            ret = Math.max(ret, r - l + 1);
        }

        return ret;
    }
}