// Last updated: 7/9/2026, 3:11:55 PM
import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;   
        int[] dp = new int[n]; 
        Arrays.fill(dp, -1);   
        int ans = helper(nums, n - 1, dp);
        return ans;
    }

    private int helper(int[] nums, int i, int[] dp) {
        if (i < 0) return 0;   
        if (dp[i] != -1) return dp[i]; 

        int take = nums[i] + helper(nums, i - 2, dp);
        int skip = helper(nums, i - 1, dp);

        dp[i] = Math.max(take, skip); // best choice
        return dp[i];
    }
}
