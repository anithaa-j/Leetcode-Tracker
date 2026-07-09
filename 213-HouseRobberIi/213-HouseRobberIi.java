// Last updated: 7/9/2026, 3:11:45 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n <= 1) return nums[0];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        int ans1 = helper(nums, n - 2, 0, dp);
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        int ans2 = helper(nums, n - 1, 1, dp);

        return Math.max(ans1, ans2);
    }

    private int helper(int[] nums, int i, int start, int[] dp) {
        if (i < start) return 0;

        if (dp[i] != -1) return dp[i];

        int take = nums[i] + helper(nums, i - 2, start, dp);
        int skip = helper(nums, i - 1, start, dp);

        return dp[i] = Math.max(take, skip);
    }
}