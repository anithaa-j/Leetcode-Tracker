// Last updated: 10/8/2026, 9:54:19 AM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int n = nums.length;
4        int sum = nums[0]+nums[1]+nums[2];
5        for(int i= 0;i<n;i++){
6            for(int j = i+1;j<n;j++){
7                for(int k =j+1;k<n;k++){
8                    int cur = nums[i]+nums[j]+nums[k];
9                    if(Math.abs(cur - target) < Math.abs(sum - target)){
10                        sum = cur;
11                    }
12                }
13            }
14        }
15        return sum;
16    }
17}