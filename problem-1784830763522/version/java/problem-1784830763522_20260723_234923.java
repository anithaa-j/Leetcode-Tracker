// Last updated: 7/23/2026, 11:49:23 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        if(n<3){
5            return n;
6        }
7        int ans = 1;
8        while(ans<=n){
9            ans<<=1;
10        }
11        return ans;
12    }
13}