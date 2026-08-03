// Last updated: 8/3/2026, 11:11:04 PM
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3
4        int n = stoneValue.length;
5
6        int[] dp = new int[n + 1];
7        Arrays.fill(dp, Integer.MIN_VALUE);
8
9        dp[n] = 0;
10
11        for (int i = n - 1; i >= 0; i--) {
12
13            int take = 0;
14
15            for (int k = 0; k < 3 && i + k < n; k++) {
16
17                take += stoneValue[i + k];
18
19                dp[i] = Math.max(
20                    dp[i],
21                    take - dp[i + k + 1]
22                );
23            }
24        }
25
26        if (dp[0] > 0)
27            return "Alice";
28
29        if (dp[0] < 0)
30            return "Bob";
31
32        return "Tie";
33    }
34}