// Last updated: 8/23/2026, 10:48:35 AM
1class Solution {
2    public boolean sumGame(String num) {
3       int n = num.length();
4       int half = n/2;
5       int s1 =0,s2=0;
6       int q1 =0, q2 =0;
7       for(int i =0;i<n;i++){
8            char c = num.charAt(i);
9            if (c == '?') {
10                if (i < half) q1++;
11                else q2++;
12            } else {
13                if (i < half) s1 += (c - '0');
14                else s2 += (c - '0');
15            }
16       }
17       if((q1 + q2)%2 !=0) return true;
18       return (2 * s1 + 9 * q1) != (2 * s2 + 9 * q2);
19    }
20}