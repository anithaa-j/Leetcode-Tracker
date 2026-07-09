// Last updated: 7/9/2026, 3:11:34 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int fr = n*(n+1)/2;
        int cur = 0;
        for(int i =0;i<n;i++){
            cur += nums[i];
        }
        return fr - cur;
    }
}