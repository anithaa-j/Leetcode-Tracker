// Last updated: 7/17/2026, 8:31:31 PM
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3       int max = 0;
4        for (int x : nums) max = Math.max(max, x);
5
6        int[] freq = new int[max + 1];
7        for (int x : nums) freq[x]++;
8        long[] divisible = new long[max + 1];
9        // Count numbers divisible by i
10        for (int i = 1; i <= max; i++) {
11            for (int j = i; j <= max; j += i) {
12                divisible[i] += freq[j];
13            }
14        }
15        long[] exact = new long[max + 1];
16        // Inclusion-Exclusion
17        for (int i = max; i >= 1; i--) {
18            exact[i] = divisible[i] * (divisible[i] - 1) / 2;
19            for (int j = i * 2; j <= max; j += i) {
20                exact[i] -= exact[j];
21            }
22        }
23
24        long[] prefix = new long[max + 1];
25        for (int i = 1; i <= max; i++) {
26            prefix[i] = prefix[i - 1] + exact[i];
27        }
28
29        int[] ans = new int[queries.length];
30
31        for (int k = 0; k < queries.length; k++) {
32            long target = queries[k] + 1; // 0-indexed -> 1-indexed
33
34            int l = 1, r = max;
35            while (l < r) {
36                int mid = (l + r) / 2;
37                if (prefix[mid] >= target)
38                    r = mid;
39                else
40                    l = mid + 1;
41            }
42            ans[k] = l;
43        }
44
45        return ans;  
46    }
47}