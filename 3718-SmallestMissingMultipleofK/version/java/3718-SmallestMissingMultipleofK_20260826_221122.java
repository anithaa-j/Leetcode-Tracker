// Last updated: 8/26/2026, 10:11:22 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> seen = new HashSet<>();
4        for(int num :nums){
5            seen.add(num);
6        }
7        int cur = k;
8        while(seen.contains(cur)){
9            cur+=k;
10        }
11        return cur;
12    }
13}