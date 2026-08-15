// Last updated: 8/15/2026, 10:59:41 PM
1class Solution {
2    public int longestSubsequence(int[] A) {
3        int tot = 0, n = A.length;
4        boolean nonZero = false;
5
6        for (int x : A) {
7            nonZero |= x > 0;
8            tot ^= x;
9        }
10
11        if (!nonZero) return 0;
12        return tot == 0 ? n - 1 : n;
13    }
14}