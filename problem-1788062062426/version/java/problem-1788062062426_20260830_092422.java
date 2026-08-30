// Last updated: 8/30/2026, 9:24:22 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer> seen = new HashSet<>();
4        Set<Integer> notspl = new HashSet<>();
5        int n = nums.length;
6        for(int i =0;i<n;i++){
7            if(i == 0 || nums[i] != nums[i-1]){
8                if(seen.contains(nums[i])){
9                    notspl.add(nums[i]);
10                }
11                seen.add(nums[i]);
12            }
13        }
14        return seen.size() - notspl.size();
15    }
16}