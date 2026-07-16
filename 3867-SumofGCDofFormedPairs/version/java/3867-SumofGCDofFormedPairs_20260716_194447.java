// Last updated: 7/16/2026, 7:44:47 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int n = nums.length;
4        int[] pg = new int[n];
5        int mx =0;
6        for(int i =0;i<n ;i++){
7            mx = Math.max(mx,nums[i]);
8            pg[i] = gcd(nums[i],mx);
9        }
10        Arrays.sort(pg);
11        long sum =0;
12        int l =0;
13        int r = n-1;
14        while(l<r){
15            sum+= gcd(pg[l],pg[r]);
16            l++;
17            r--;
18        }
19        return sum;
20    }
21    private int gcd(int a, int b){
22        while(b!=0){
23            int t = b;
24            b = a%b;
25            a = t;
26        }
27        return a;
28    }
29}