class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> sMap = new HashMap<>();
        char[] sarr = s.toCharArray();
        int ret = 0;
        for (int l = 0, r = 0; r < sarr.length; r++) {
            sMap.put(sarr[r], sMap.getOrDefault(sarr[r], 0) + 1);
            while(!valid(sMap) && l <= r) {
                sMap.put(sarr[l], sMap.get(sarr[l]) - 1);
                l++;
            }
            ret = Math.max(ret, r - l + 1);
        }

        return ret;
    }

    boolean valid(Map<Character, Integer> s) {
        for (Map.Entry<Character, Integer> e : s.entrySet()) {
            if (e.getValue() > 1) {
                return false;
            }
        }
        return true;
    }
}