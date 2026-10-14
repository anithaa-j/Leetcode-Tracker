// Last updated: 10/14/2026, 11:03:46 PM
1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        // Step 1: the biggest possible digit sum is 9 * num
4        if (sum > 9 * num) return "";
5
6        StringBuilder ans = new StringBuilder();
7
8        // Step 2: fill every position from left to right
9        while (num-- > 0) {
10            int digit = Math.min(9, sum);   // take as much as we can, at most 9
11            ans.append(digit);
12            sum -= digit;
13        }
14
15        return sum == 0 ? ans.toString() : "";
16    }
17}