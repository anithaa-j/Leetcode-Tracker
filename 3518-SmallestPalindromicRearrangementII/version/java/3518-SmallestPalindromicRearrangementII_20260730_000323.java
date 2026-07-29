// Last updated: 7/30/2026, 12:03:23 AM
1class Solution {
2
3    static final long LIMIT = 1_000_000L;
4
5    public String smallestPalindrome(String s, int k) {
6
7        int[] freq = new int[26];
8
9        for (char ch : s.toCharArray())
10            freq[ch - 'a']++;
11
12        String middle = "";
13
14        int[] half = new int[26];
15        int len = 0;
16
17        for (int i = 0; i < 26; i++) {
18            if ((freq[i] & 1) == 1)
19                middle = String.valueOf((char) ('a' + i));
20
21            half[i] = freq[i] / 2;
22            len += half[i];
23        }
24
25        long total = countWays(half, len);
26
27        if (total < k)
28            return "";
29
30        StringBuilder left = new StringBuilder();
31
32        while (len > 0) {
33
34            for (int c = 0; c < 26; c++) {
35
36                if (half[c] == 0)
37                    continue;
38
39                half[c]--;
40
41                long ways = countWays(half, len - 1);
42
43                if (ways >= k) {
44                    left.append((char) ('a' + c));
45                    len--;
46                    break;
47                } else {
48                    k -= ways;
49                    half[c]++;
50                }
51            }
52        }
53
54        StringBuilder ans = new StringBuilder();
55
56        ans.append(left);
57        ans.append(middle);
58        ans.append(new StringBuilder(left).reverse());
59
60        return ans.toString();
61    }
62
63    private long countWays(int[] cnt, int len) {
64
65        long res = 1;
66
67        int remaining = len;
68
69        for (int x : cnt) {
70
71            if (x == 0)
72                continue;
73
74            res *= combLimited(remaining, x);
75
76            if (res > LIMIT)
77                return LIMIT;
78
79            remaining -= x;
80        }
81
82        return Math.min(res, LIMIT);
83    }
84
85    private long combLimited(int n, int r) {
86
87        if (r > n)
88            return 0;
89
90        r = Math.min(r, n - r);
91
92        long ans = 1;
93
94        for (int i = 1; i <= r; i++) {
95
96            ans = ans * (n - r + i) / i;
97
98            if (ans > LIMIT)
99                return LIMIT;
100        }
101
102        return Math.min(ans, LIMIT);
103    }
104}