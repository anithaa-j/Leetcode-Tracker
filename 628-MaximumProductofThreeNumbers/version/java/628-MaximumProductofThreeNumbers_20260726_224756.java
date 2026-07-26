// Last updated: 7/26/2026, 10:47:56 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
6        int option2 = nums[0] * nums[1] * nums[n - 1];
7        return Math.max(option1, option2);
8    }
9}