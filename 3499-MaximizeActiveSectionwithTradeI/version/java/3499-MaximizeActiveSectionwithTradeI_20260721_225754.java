// Last updated: 7/21/2026, 10:57:54 PM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        String t = "1" + s + "1";
4        int n = t.length();
5
6        int total = 0;
7        for (char c : s.toCharArray()) {
8            if (c == '1') total++;
9        }
10
11        int ans = total;
12
13        for (int i = 1; i < n - 1; ) {
14
15            if (t.charAt(i) != '1') {
16                i++;
17                continue;
18            }
19
20            int l = i;
21            while (i < n - 1 && t.charAt(i) == '1') i++;
22            int r = i - 1;
23
24            if (l == 0 || r == n - 1) continue;
25
26            if (t.charAt(l - 1) == '0' && t.charAt(r + 1) == '0') {
27
28                int left = l - 1;
29                while (left >= 0 && t.charAt(left) == '0') left--;
30
31                int right = r + 1;
32                while (right < n && t.charAt(right) == '0') right++;
33
34                int removed = r - l + 1;
35                int gain = right - left - 1;
36
37                ans = Math.max(ans, total - removed + gain);
38            }
39        }
40
41        return ans;
42    }
43}