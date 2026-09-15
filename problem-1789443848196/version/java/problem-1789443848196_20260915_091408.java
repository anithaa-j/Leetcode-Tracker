// Last updated: 9/15/2026, 9:14:08 AM
1class Solution {
2    public int maxPalindromes(String s, int k) {
3        int n = s.length();
4        if (k == 1)
5            return n;
6
7        int res = 0;
8
9        for (int i = 0; i <= n - k; i++) {
10            if (check(s, i, i + k - 1)) {
11                res++;
12                i += k - 1;
13            } else if (i < n - k && check(s, i, i + k)) {
14                res++;
15                i += k;
16            }
17        }
18
19        return res;
20    }
21
22    boolean check(String s, int l, int r) {
23        for (; l < r; l++, r--)
24            if (s.charAt(l) != s.charAt(r))
25                return false;
26        return true;
27    }
28}