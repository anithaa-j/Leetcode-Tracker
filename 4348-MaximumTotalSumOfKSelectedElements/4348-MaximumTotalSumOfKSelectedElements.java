// Last updated: 7/9/2026, 3:05:57 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length;
        long total = 0;
        for(int i =n-1;i>=n-k;i--){
            long add = nums[i];
            long m = (long) nums[i]*mul;
            if(m>add){
                total+=m;
            }else{
                total+=add;
            }
            mul--;
        }
        return total;
    }
}