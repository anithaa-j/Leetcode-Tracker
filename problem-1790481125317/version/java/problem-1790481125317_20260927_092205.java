// Last updated: 9/27/2026, 9:22:05 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int b =0;
4        int be = 0;
5        HashMap<String,Integer> map = new HashMap<>();
6        for(int i = 1;i<nums.length;i++){
7            if(nums[i] == nums[i-1]){
8                b++;
9            }else{
10                int x = Math.min(nums[i],nums[i-1]);
11                int y = Math.max(nums[i],nums[i-1]);
12                String key = x+ "," + y;
13                map.put(key,map.getOrDefault(key, 0)+1);
14                be = Math.max(be,map.get(key));
15            }
16        }
17        return b + be;
18    }
19}