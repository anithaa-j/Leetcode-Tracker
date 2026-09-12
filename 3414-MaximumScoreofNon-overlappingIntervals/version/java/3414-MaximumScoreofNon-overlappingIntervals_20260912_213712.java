// Last updated: 9/12/2026, 9:37:12 PM
1import java.util.*;
2
3class Solution {
4
5    static class State {
6        long score;
7        int[] indices;
8
9        State(long score, int[] indices) {
10            this.score = score;
11            this.indices = indices;
12        }
13    }
14
15    public int[] maximumWeight(List<List<Integer>> intervals) {
16
17        int n = intervals.size();
18
19        int[][] a = new int[n][4];
20
21        for (int i = 0; i < n; i++) {
22            a[i][0] = intervals.get(i).get(0);
23            a[i][1] = intervals.get(i).get(1);
24            a[i][2] = intervals.get(i).get(2);
25            a[i][3] = i;
26        }
27
28        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
29
30        int[] next = new int[n];
31
32        for (int i = 0; i < n; i++) {
33
34            int low = i + 1;
35            int high = n;
36
37            while (low < high) {
38
39                int mid = low + (high - low) / 2;
40
41                if (a[mid][0] > a[i][1]) {
42                    high = mid;
43                } else {
44                    low = mid + 1;
45                }
46            }
47
48            next[i] = low;
49        }
50
51        State[][] dp = new State[n + 1][5];
52
53        // Initialize all states
54        for (int i = 0; i <= n; i++) {
55            for (int k = 0; k <= 4; k++) {
56                dp[i][k] = new State(0, new int[0]);
57            }
58        }
59
60        for (int i = n - 1; i >= 0; i--) {
61
62            for (int k = 1; k <= 4; k++) {
63
64                // Skip current interval
65                State skip = dp[i + 1][k];
66
67                // Take current interval
68                State after = dp[next[i]][k - 1];
69
70                int[] takeIndices =
71                    new int[after.indices.length + 1];
72
73                takeIndices[0] = a[i][3];
74
75                for (int j = 0; j < after.indices.length; j++) {
76                    takeIndices[j + 1] = after.indices[j];
77                }
78
79                Arrays.sort(takeIndices);
80
81                State take = new State(
82                    a[i][2] + after.score,
83                    takeIndices
84                );
85
86                dp[i][k] = better(take, skip);
87            }
88        }
89
90        return dp[0][4].indices;
91    }
92
93    private State better(State a, State b) {
94
95        if (a.score > b.score) {
96            return a;
97        }
98
99        if (a.score < b.score) {
100            return b;
101        }
102
103        if (compare(a.indices, b.indices) < 0) {
104            return a;
105        }
106
107        return b;
108    }
109
110    private int compare(int[] a, int[] b) {
111
112        int n = Math.min(a.length, b.length);
113
114        for (int i = 0; i < n; i++) {
115
116            if (a[i] < b[i]) {
117                return -1;
118            }
119
120            if (a[i] > b[i]) {
121                return 1;
122            }
123        }
124
125        return Integer.compare(a.length, b.length);
126    }
127}