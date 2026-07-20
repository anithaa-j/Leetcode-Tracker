// Last updated: 7/20/2026, 9:46:52 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3      int m = grid.length;
4        int n = grid[0].length;
5        int size = m * n;
6
7        k %= size;
8
9        int[][] ans = new int[m][n];
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                int index = i * n + j;
14                int newIndex = (index + k) % size;
15
16                int newRow = newIndex / n;
17                int newCol = newIndex % n;
18
19                ans[newRow][newCol] = grid[i][j];
20            }
21        }
22
23        List<List<Integer>> result = new ArrayList<>();
24
25        for (int i = 0; i < m; i++) {
26            List<Integer> row = new ArrayList<>();
27            for (int j = 0; j < n; j++) {
28                row.add(ans[i][j]);
29            }
30            result.add(row);
31        }
32
33        return result;  
34    }
35}