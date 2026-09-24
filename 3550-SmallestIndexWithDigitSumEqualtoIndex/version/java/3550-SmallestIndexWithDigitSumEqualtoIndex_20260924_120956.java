// Last updated: 9/24/2026, 12:09:56 PM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        int n = nums.length;
4        for(int i =0;i<n;i++){
5            int num = nums[i];
6            int sum =0;
7            while(num>0){
8                sum = sum+(num%10);
9                num/=10;
10            }
11            if(i == sum)return i;
12        }
13        return -1;
14    }
15}