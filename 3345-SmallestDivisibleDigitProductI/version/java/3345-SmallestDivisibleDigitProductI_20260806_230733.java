// Last updated: 8/6/2026, 11:07:33 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(true){
4            int x = n;
5            int pro = 1;
6            while(x>0){
7                pro *= (x%10);
8                x/=10;
9            }
10            if(pro % t == 0)
11                return n;
12            n++;
13        }
14    }
15}