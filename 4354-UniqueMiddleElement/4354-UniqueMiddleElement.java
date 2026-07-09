// Last updated: 7/9/2026, 3:05:56 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = n/2;
    
        int c=0;
        for(int i : nums){
            if(i == nums[mid]) c++;
        }
        return c==1;
    }
}