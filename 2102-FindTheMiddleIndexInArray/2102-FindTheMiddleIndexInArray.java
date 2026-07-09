// Last updated: 7/9/2026, 3:09:43 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int k = nums.length;
        for(int mid =0;mid<k;mid++){
             int sum =0;
             for(int i =0;i<mid;i++){
                sum+=nums[i];
            }
            int last =0;
            for(int i = mid+1;i<k;i++){
                last+=nums[i];
            }
            if(sum == last) return mid;
        }
       
        return -1;
    }
}