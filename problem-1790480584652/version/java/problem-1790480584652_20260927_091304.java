// Last updated: 9/27/2026, 9:13:04 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int max = 0;
4        for(int n : nums) max = Math.max(max,n);
5        int[] freq = new int[max+1];
6        for(int n : nums) freq[n]++;
7
8        int[] ans = new int[nums.length];
9        int k = 0;
10        while(k<nums.length){
11            for(int i = 0;i<=max; i++){
12                if(freq[i]>0){
13                    ans[k++] = i;
14                    freq[i]--;
15                }
16            }
17        }
18        return ans;
19    }
20}