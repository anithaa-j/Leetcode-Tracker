// Last updated: 7/9/2026, 3:06:01 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0; i<=nums.length-1;i++){
            if(nums[i]<10)
            sum1+=nums[i];
            else
            sum2+=nums[i];
        }
        if(sum1==sum2)
        return false;
        else 
        return true;
    }
}