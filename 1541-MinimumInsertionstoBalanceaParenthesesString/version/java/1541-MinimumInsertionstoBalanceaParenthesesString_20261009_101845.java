// Last updated: 10/9/2026, 10:18:45 AM
1class Solution {
2    public int minInsertions(String s) {
3        int need = 0;
4        int ans = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '(') {
8                need += 2;
9
10                if (need % 2 != 0) {
11                    ans++;
12                    need--;
13                }
14            } else {
15                need--;
16
17                if (need < 0) {
18                    ans++;
19                    need = 1;
20                }
21            }
22        }
23
24        return ans + need;
25    }
26}