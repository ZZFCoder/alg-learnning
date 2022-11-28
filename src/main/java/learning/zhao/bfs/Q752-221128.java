/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        q.offer("0000");

        Set<String> dead = new HashSet<>();
        for (String s : deadends) {
            dead.add(s);
        }

        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int steps = 0;
        while (!q.isEmpty()) {
            for (int j = 0; j < q.size(); j++) {
                String s = q.poll();
                if (s.equals(target)) {
                    return steps;
                }

                for (int i = 0; i < s.length(); i++) {
                    String s0 = up(s, i);
                    if (!dead.contains(s0) && !visited.contains(s0)) {
                        q.add(s0);
                        visited.add(s0);
                    }
                    String s1 = down(s, i);
                    if (!dead.contains(s1) && !visited.contains(s1)) {
                        q.add(s1);
                        visited.add(s1);
                    }
                }
            }
            steps++;
        }

        return -1;
    }

    String up(String s, int i) {
        char[] str = s.toCharArray();
        if (str[i] == '9') {
            str[i] = '0';
        }
        else {
            str[i] += 1;
        }
        return new String(str);
    }

    String down(String s, int i) {
        char[] str = s.toCharArray();
        if (str[i] == '0') {
            str[i] = '9';
        }
        else {
            str[i] -= 1;
        }
        return new String(str);
    }
}
// @lc code=end

