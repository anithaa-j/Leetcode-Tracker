// Last updated: 7/9/2026, 3:10:03 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}