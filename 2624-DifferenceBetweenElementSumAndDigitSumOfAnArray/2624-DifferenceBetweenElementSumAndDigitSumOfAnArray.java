// Last updated: 7/9/2026, 3:06:33 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0,y=0;
        for(int n:nums){
            x+=n;
            while(n!=0){
                y+=n%10;
                n/=10;
            }
        }
        return Math.abs(x-y);
    }
}