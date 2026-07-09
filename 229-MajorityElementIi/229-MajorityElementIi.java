// Last updated: 7/9/2026, 3:11:44 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> np = new HashMap<>();
        int n = nums.length;
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            np.put(nums[i],np.getOrDefault(nums[i],0)+1);
            if(np.get(nums[i])>n/3){
                if(!l.contains(nums[i])){
                    l.add(nums[i]);
                }
            }
        }
        
        return l;
    }
}