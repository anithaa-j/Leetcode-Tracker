// Last updated: 8/8/2026, 9:16:43 PM
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5
6        int[] last = new int[m];
7
8        java.util.Arrays.fill(last, -1);
9
10        int i = n - 1;
11        int j = m - 1;
12
13        while (i >= 0 && j >= 0) {
14            if (word1.charAt(i) == word2.charAt(j)) {
15                last[j] = i;
16                --j;
17            }
18
19            --i;
20        }
21
22        int[] ans = new int[m];
23        int size = 0;
24
25        boolean canSkip = true;
26        j = 0;
27
28        for (i = 0; i < n && j < m; ++i) {
29            if (word1.charAt(i) == word2.charAt(j)) {
30                ans[size++] = i;
31                ++j;
32            }
33            else if (canSkip &&
34                     (j == m - 1 || i < last[j + 1])) {
35                canSkip = false;
36                ans[size++] = i;
37                ++j;
38            }
39        }
40
41        if (j == m) {
42            return ans;
43        }
44
45        return new int[0];
46    }
47}