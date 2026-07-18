// Last updated: 7/18/2026, 10:25:28 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int s = nums[0];
6        int l = nums[n-1];
7        return gcd(s,l);
8    }
9    public int gcd(int a, int b) {
10        while (b != 0) {
11            int temp = b;
12            b = a % b;
13            a = temp;
14        }
15        return a;
16    }
17}