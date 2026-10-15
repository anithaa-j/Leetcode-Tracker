// Last updated: 10/15/2026, 10:55:24 PM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n = nums.size();
4        int s =0;
5        for(int i =0;i<n;i++){
6            Set<Integer> set = new HashSet<>();
7            for(int j = i;j<n;j++){
8                set.add(nums.get(j));
9                int c = set.size();
10                s+=c*c;
11            }
12        }
13        return s;
14    }
15}