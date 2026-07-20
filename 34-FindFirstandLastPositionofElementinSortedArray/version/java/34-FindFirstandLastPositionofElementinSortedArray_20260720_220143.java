// Last updated: 7/20/2026, 10:01:43 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int n = nums.length;
4        int[] arr = {-1,-1};
5        for(int i = 0;i<n;i++){
6            if(nums[i] == target){
7                if (arr[0] == -1) {
8                    arr[0] = i;
9                }
10                arr[1] = i;
11            }
12        }
13        return arr;
14    }
15}