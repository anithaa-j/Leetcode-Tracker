// Last updated: 8/1/2026, 8:56:42 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int zero = 0;
4        int one = 0;
5        int ans =0;
6        for(int i =0; i<s.length(); i++){
7            if(s.charAt(i) == '0') zero++;
8            else one++;
9             if(Math.abs(zero - one) <= 1) ans++;
10        }
11        return ans;
12    }
13}