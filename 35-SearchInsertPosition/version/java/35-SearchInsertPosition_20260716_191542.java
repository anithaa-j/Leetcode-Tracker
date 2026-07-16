// Last updated: 7/16/2026, 7:15:42 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int n = nums.length;
4        for(int i =0;i<n;i++){
5            if(nums[i] == target) return i;
6            else if(nums[i]>target){
7                return i;
8            }
9        }
10        return n;
11    }
12}