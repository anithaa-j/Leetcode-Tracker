// Last updated: 7/9/2026, 3:12:39 PM
class Solution {
    public void sortColors(int[] nums) {
        int zc = 0, oc =0, tc =0;
        for(int x : nums){
            if(x == 0) zc++;
            else if (x ==1) oc++;
            else tc++;
        }
        int i =0;
        while(zc-->0) nums[i++] = 0;
        while(oc-->0) nums[i++] = 1;
        while(tc-->0) nums[i++] = 2;
    }
}