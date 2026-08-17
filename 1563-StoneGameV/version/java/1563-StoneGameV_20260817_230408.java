// Last updated: 8/17/2026, 11:04:08 PM
1class Solution {
2
3    int[][] f;
4
5    public int stoneGameV(int[] stoneValue) {
6        int n = stoneValue.length;
7        f = new int[n][n];
8        return dfs(stoneValue, 0, n - 1);
9    }
10
11    public int dfs(int[] stoneValue, int left, int right) {
12        if (left == right) {
13            return 0;
14        }
15        if (f[left][right] != 0) {
16            return f[left][right];
17        }
18
19        int sum = 0;
20        for (int i = left; i <= right; ++i) {
21            sum += stoneValue[i];
22        }
23        int suml = 0;
24        for (int i = left; i < right; ++i) {
25            suml += stoneValue[i];
26            int sumr = sum - suml;
27            if (suml < sumr) {
28                f[left][right] = Math.max(
29                    f[left][right],
30                    dfs(stoneValue, left, i) + suml
31                );
32            } else if (suml > sumr) {
33                f[left][right] = Math.max(
34                    f[left][right],
35                    dfs(stoneValue, i + 1, right) + sumr
36                );
37            } else {
38                f[left][right] = Math.max(
39                    f[left][right],
40                    Math.max(
41                        dfs(stoneValue, left, i),
42                        dfs(stoneValue, i + 1, right)
43                    ) + suml
44                );
45            }
46        }
47        return f[left][right];
48    }
49}