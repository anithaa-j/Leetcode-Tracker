// Last updated: 7/22/2026, 11:05:50 PM
1class Solution {
2    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
3        int n = s.length();
4        int totalOnes = 0;
5        
6        for (int i = 0; i < n; i++) {
7            if (s.charAt(i) == '1') {
8                totalOnes++;
9            }
10        }
11        
12        List<Integer> typeList = new ArrayList<>();
13        List<Integer> startList = new ArrayList<>();
14        List<Integer> endList = new ArrayList<>();
15        
16        for (int i = 0; i < n; ) {
17            int j = i;
18            while (j < n && s.charAt(j) == s.charAt(i)) {
19                j++;
20            }
21            typeList.add(s.charAt(i) - '0');
22            startList.add(i);
23            endList.add(j - 1);
24            i = j;
25        }
26        
27        int N = typeList.size();
28        int[] type = new int[N];
29        int[] start = new int[N];
30        int[] endIdx = new int[N];
31        for (int i = 0; i < N; i++) {
32            type[i] = typeList.get(i);
33            start[i] = startList.get(i);
34            endIdx[i] = endList.get(i);
35        }
36        
37        int[] posToSeg = new int[n];
38        for (int i = 0; i < N; i++) {
39            for (int j = start[i]; j <= endIdx[i]; j++) {
40                posToSeg[j] = i;
41            }
42        }
43        
44        int[] ans = new int[N];
45        for (int i = 1; i < N - 1; i++) {
46            if (type[i] == 1) {
47                ans[i] = (endIdx[i - 1] - start[i - 1] + 1) + (endIdx[i + 1] - start[i + 1] + 1);
48            }
49        }
50        
51        int[] logTable = new int[N + 1];
52        for (int i = 2; i <= N; i++) {
53            logTable[i] = logTable[i / 2] + 1;
54        }
55        
56        int K = logTable[N] + 1;
57        int[][] st = new int[K][N];
58        for (int i = 0; i < N; i++) {
59            st[0][i] = ans[i];
60        }
61        
62        for (int j = 1; j < K; j++) {
63            for (int i = 0; i + (1 << j) <= N; i++) {
64                st[j][i] = Math.max(st[j - 1][i], st[j - 1][i + (1 << (j - 1))]);
65            }
66        }
67        
68        List<Integer> res = new ArrayList<>();
69        
70        for (int[] q : queries) {
71            int L = q[0];
72            int R = q[1];
73            
74            int segL = posToSeg[L];
75            int segR = posToSeg[R];
76            
77            if (segR - segL < 2) {
78                res.add(totalOnes);
79                continue;
80            }
81            
82            int maxGain = 0;
83            maxGain = Math.max(maxGain, evaluateEdge(segL + 1, L, R, segL, segR, type, start, endIdx));
84            maxGain = Math.max(maxGain, evaluateEdge(segR - 1, L, R, segL, segR, type, start, endIdx));
85            
86            if (segL + 2 <= segR - 2) {
87                int L_idx = segL + 2;
88                int R_idx = segR - 2;
89                int j = logTable[R_idx - L_idx + 1];
90                int rmqVal = Math.max(st[j][L_idx], st[j][R_idx - (1 << j) + 1]);
91                maxGain = Math.max(maxGain, rmqVal);
92            }
93            
94            res.add(totalOnes + maxGain);
95        }
96        
97        return res;
98    }
99    
100    private int evaluateEdge(int i, int L, int R, int segL, int segR, int[] type, int[] start, int[] endIdx) {
101        if (i <= segL || i >= segR) return 0;
102        if (type[i] == 0) return 0;
103        
104        int leftLen = 0;
105        if (i - 1 == segL) leftLen = Math.max(0, endIdx[i - 1] - L + 1);
106        else leftLen = endIdx[i - 1] - start[i - 1] + 1;
107        
108        int rightLen = 0;
109        if (i + 1 == segR) rightLen = Math.max(0, R - start[i + 1] + 1);
110        else rightLen = endIdx[i + 1] - start[i + 1] + 1;
111        
112        return leftLen + rightLen;
113    }
114}