// Last updated: 10/10/2026, 4:02:02 PM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int[] d = new int[100001];
4        long k = (long) k1 + k2, sum = 0;
5        int max = 0;
6
7        for (int i = 0; i < nums1.length; i++) {
8            int x = Math.abs(nums1[i] - nums2[i]);
9            d[x]++;
10            sum += x;
11            max = Math.max(max, x);
12        }
13
14        if (sum <= k) return 0;
15
16        for (int i = max; i > 0 && k > 0; i--) {
17            long move = Math.min(k, d[i]);
18            d[i] -= move;
19            d[i - 1] += move;
20            k -= move;
21        }
22
23        long ans = 0;
24        for (int i = 0; i <= max; i++)
25            ans += (long) i * i * d[i];
26
27        return ans;
28    }
29}