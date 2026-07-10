// Last updated: 7/10/2026, 2:20:21 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) return "";
4
5        int[] count = new int[128];
6
7        for (char c : t.toCharArray()) {
8            count[c]++;
9        }
10
11        int left = 0;
12        int right = 0;
13        int required = t.length();
14
15        int minLen = Integer.MAX_VALUE;
16        int start = 0;
17
18        while (right < s.length()) {
19            char c = s.charAt(right);
20
21            if (count[c] > 0) {
22                required--;
23            }
24            count[c]--;
25            right++;
26
27            while (required == 0) {
28                if (right - left < minLen) {
29                    minLen = right - left;
30                    start = left;
31                }
32
33                char ch = s.charAt(left);
34                count[ch]++;
35
36                if (count[ch] > 0) {
37                    required++;
38                }
39
40                left++;
41            }
42        }
43
44        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
45    }
46}