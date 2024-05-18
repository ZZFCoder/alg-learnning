class Solution {
    public String minWindow(String s, String t) {
        int[] stat = new int[256];
        int ret = Integer.MAX_VALUE;
        int start = 0;
        for (char c : t.toCharArray()) {
            stat[c] -= 1;
        }

        int l = 0;
        int slen = s.length();
        for (int r = 0; r < slen; r++) {
            stat[s.charAt(r)] += 1;
            while(include(stat)) {
                if (ret > r - l + 1) {
                    ret = r - l + 1;
                    start = l;
                }
                stat[s.charAt(l++)] -= 1;
            }
        }

        return ret == Integer.MAX_VALUE ? "": s.substring(start, start + ret);
    }

    boolean include(int[] s) {
        for (int i : s) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }
}