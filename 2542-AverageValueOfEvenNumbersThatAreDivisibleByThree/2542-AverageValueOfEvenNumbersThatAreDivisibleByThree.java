// Last updated: 7/9/2026, 3:06:43 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, count = 0;
        for(int num:nums){
            if(num%6==0){
            sum +=num;
            count++;
            }
        }
        return count==0 ? 0:sum/count;
    }
}