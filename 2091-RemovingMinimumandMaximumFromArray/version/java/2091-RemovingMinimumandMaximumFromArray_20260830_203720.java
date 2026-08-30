// Last updated: 8/30/2026, 8:37:20 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7
8        int minIndex = 0;
9        int maxIndex = 0;
10
11        for (int i = 0; i < n; i++) {
12            if (nums[i] < min) {
13                min = nums[i];
14                minIndex = i;
15            }
16
17            if (nums[i] > max) {
18                max = nums[i];
19                maxIndex = i;
20            }
21        }
22
23        int left = Math.min(minIndex, maxIndex);
24        int right = Math.max(minIndex, maxIndex);
25
26        int fromFront = right + 1;
27        int fromBack = n - left;
28        int bothSides = (left + 1) + (n - right);
29
30        return Math.min(fromFront, Math.min(fromBack, bothSides));
31    }
32}