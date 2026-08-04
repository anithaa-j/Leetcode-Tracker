// Last updated: 8/4/2026, 10:58:08 PM
1import java.util.*;
2class Solution {
3    public List<Integer> findMissingElements(int[] nums) {
4        Arrays.sort(nums);
5        List<Integer> ans = new ArrayList<>();
6        for (int i = 0; i < nums.length - 1; i++) {
7            int curr = nums[i];
8            int next = nums[i + 1];
9            for (int j = curr + 1; j < next; j++) {
10                ans.add(j);
11            }
12        }
13        return ans;  
14    }
15}