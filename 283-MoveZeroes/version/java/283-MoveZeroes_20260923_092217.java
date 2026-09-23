// Last updated: 9/23/2026, 9:22:17 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int l =0;
4        for(int i =0;i<nums.length;i++){
5            if(nums[i]!=0){
6                int t = nums[i];
7                nums[i] = nums[l];
8                nums[l] = t;
9                l++;
10            }
11        }
12        return ;
13    }
14}