// Last updated: 7/9/2026, 3:05:53 PM
import java.util.Arrays;

class Solution {
    public int absDifference(int[] nums, int k) {
    
        Arrays.sort(nums);
        
        int smallSum = 0;
        for (int i = 0; i < k; i++) {
            smallSum += nums[i];
        }
        
    
        int largeSum = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            largeSum += nums[i];
        }
        
        return Math.abs(largeSum - smallSum);
    }
}
