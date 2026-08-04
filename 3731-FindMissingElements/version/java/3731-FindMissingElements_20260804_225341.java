// Last updated: 8/4/2026, 10:53:41 PM
1import java.util.*;
2class Solution {
3    public List<Integer> findMissingElements(int[] nums) {
4        int min = Integer.MAX_VALUE;
5        int max = Integer.MIN_VALUE;
6        HashSet<Integer> set = new HashSet<>();
7        for (int num : nums) {
8            min = Math.min(min, num);
9            max = Math.max(max, num);
10            set.add(num);
11        }
12        List<Integer> ans = new ArrayList<>();
13        for (int i = min; i <= max; i++) {
14            if (!set.contains(i)) {
15                ans.add(i);
16            }
17        }
18        return ans;
19    }
20}