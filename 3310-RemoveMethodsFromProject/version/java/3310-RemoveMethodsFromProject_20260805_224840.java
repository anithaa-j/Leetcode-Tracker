// Last updated: 8/5/2026, 10:48:40 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
5
6        List<List<Integer>> graph = new ArrayList<>();
7        for (int i = 0; i < n; i++) {
8            graph.add(new ArrayList<>());
9        }
10
11        for (int[] edge : invocations) {
12            graph.get(edge[0]).add(edge[1]);
13        }
14
15        boolean[] suspicious = new boolean[n];
16
17        // DFS to mark all suspicious methods
18        Stack<Integer> stack = new Stack<>();
19        stack.push(k);
20        suspicious[k] = true;
21
22        while (!stack.isEmpty()) {
23            int u = stack.pop();
24
25            for (int v : graph.get(u)) {
26                if (!suspicious[v]) {
27                    suspicious[v] = true;
28                    stack.push(v);
29                }
30            }
31        }
32
33        // Check if any outside method invokes a suspicious one
34        for (int[] edge : invocations) {
35            int u = edge[0];
36            int v = edge[1];
37
38            if (!suspicious[u] && suspicious[v]) {
39                List<Integer> ans = new ArrayList<>();
40                for (int i = 0; i < n; i++) {
41                    ans.add(i);
42                }
43                return ans;
44            }
45        }
46
47        // Remove suspicious methods
48        List<Integer> ans = new ArrayList<>();
49        for (int i = 0; i < n; i++) {
50            if (!suspicious[i]) {
51                ans.add(i);
52            }
53        }
54
55        return ans;
56    }
57}