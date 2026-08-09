// Last updated: 8/9/2026, 11:33:41 PM
1class Solution {
2    private int n;
3    private int[] suffix;
4    private int[][] dp;
5
6    private int solve(int i, int m) {
7        if (i == n) {
8            return 0;
9        }
10
11        if (dp[i][m] != -1) {
12            return dp[i][m];
13        }
14
15        int best = 0;
16
17        for (int x = 1; x <= 2 * m && i + x <= n; x++) {
18            int nextM = Math.max(m, x);
19            int current = suffix[i] - solve(i + x, nextM);
20            best = Math.max(best, current);
21        }
22
23        return dp[i][m] = best;
24    }
25
26    public int stoneGameII(int[] piles) {
27        n = piles.length;
28        suffix = new int[n + 1];
29
30        for (int i = n - 1; i >= 0; i--) {
31            suffix[i] = suffix[i + 1] + piles[i];
32        }
33
34        dp = new int[n][n + 1];
35
36        for (int i = 0; i < n; i++) {
37            java.util.Arrays.fill(dp[i], -1);
38        }
39
40        return solve(0, 1);
41    }
42}