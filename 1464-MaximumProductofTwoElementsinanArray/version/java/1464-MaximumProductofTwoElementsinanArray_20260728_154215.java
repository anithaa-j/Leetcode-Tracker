// Last updated: 7/28/2026, 3:42:15 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        int ans = (nums[n-1] -1)*(nums[n-2] -1);
6        return ans;
7    }
8}