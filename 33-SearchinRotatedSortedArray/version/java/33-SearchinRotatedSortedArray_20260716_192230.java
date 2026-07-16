// Last updated: 7/16/2026, 7:22:30 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        for(int i =0;i<n;i++){
5            if(nums[i] == target) return i;
6        }
7        return -1;
8    }
9}