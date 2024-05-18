class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        int[] stat = new int[256];
        char[] sArr = s.toCharArray();
        Arrays.fill(stat, -1);
        for (int l = 0, r = 0; r < sArr.length; r++) {
            l = Math.max(l, stat[sArr[r]] + 1);
            ret = Math.max(ret, r - l + 1);
            stat[sArr[r]] = r;
        }

        return ret;
    }
}