// Last updated: 7/9/2026, 3:12:18 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> np = new HashMap<>();
        int n = nums.length;
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            np.put(nums[i],np.getOrDefault(nums[i],0)+1);
        }
        int m = n/2;
        for(Map.Entry<Integer,Integer> en:np.entrySet()){
            if (en.getValue()>m)  return en.getKey();
           
        }
        return 0;
    }
}