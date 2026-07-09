// Last updated: 7/9/2026, 3:12:43 PM
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); 
        return helper(n, dp);
    }
    private int helper(int n,int dp[]){
            if(n<=2){
                dp[n] = n;
                return n;
            }
            if(dp[n]!= -1){
                return dp[n];
            }
            dp[n] = helper(n-1,dp)+helper(n-2,dp);
            return dp[n];
            
    }
    
}