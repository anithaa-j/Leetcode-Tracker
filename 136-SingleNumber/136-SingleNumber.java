// Last updated: 7/9/2026, 3:12:30 PM
class Solution {
    public int singleNumber(int[] nums) {
        int r =0;
        for(int num : nums){
             r ^= num;
        }
        return r;
    }
}