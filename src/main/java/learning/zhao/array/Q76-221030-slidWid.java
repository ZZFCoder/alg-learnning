/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        int matched = 0;
        int left = 0, right = 0;
        int retLen = Integer.MAX_VALUE;
        int retL = 0;
        Map<Character, Integer> tc = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tc.put(t.charAt(i), tc.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> wc = new HashMap<>();
        while(right < s.length()) {            
            if (tc.containsKey(s.charAt(right))) {
                wc.put(s.charAt(right), wc.getOrDefault(s.charAt(right), 0) + 1);
                if (wc.get(s.charAt(right)).equals(tc.get(s.charAt(right)))) {
                    matched++;
                }
            }
            right ++;

            while(matched == tc.size()) {
                if (right - left < retLen) {
                    retL = left;
                    retLen = right - left;
                }

                if (tc.containsKey(s.charAt(left))) {
                    if (wc.get(s.charAt(left)).equals(tc.get(s.charAt(left)))) {
                        matched --;
                    }

                    wc.put(s.charAt(left), wc.get(s.charAt(left)) - 1);
                }
                left++;
            }
        }

        return retLen == Integer.MAX_VALUE? "": s.substring(retL, retL + retLen);
    }

    void printMap(Map<Character, Integer> m) {
        for (Map.Entry entry : m.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
// @lc code=end

