// Last updated: 7/30/2026, 4:24:16 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        int ans =0;
5        for(int i =0;i<n;i++){
6            ans += (i/8)+1;
7        }
8        return ans;
9    }
10}