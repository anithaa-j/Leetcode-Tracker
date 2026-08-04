// Last updated: 8/4/2026, 10:51:24 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findMissingElements(int[] nums) {
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7
8        HashSet<Integer> set = new HashSet<>();
9
10        for (int num : nums) {
11            min = Math.min(min, num);
12            max = Math.max(max, num);
13            set.add(num);
14        }
15
16        List<Integer> ans = new ArrayList<>();
17
18        for (int i = min; i <= max; i++) {
19            if (!set.contains(i)) {
20                ans.add(i);
21            }
22        }
23
24        return ans;
25    }
26}