// Last updated: 7/9/2026, 3:10:45 PM
class Solution {
    public int search(int[] nums, int target) {
        int i =0, j=nums.length-1, mid ;
    while(i<=j){
        mid = (i+j)/2;
        if(nums[mid] == target){
             return mid;
        }
        else if (nums[mid]>target){
             j=mid-1;
        }
        else i=mid+1;
    }
    return -1;
    }
}