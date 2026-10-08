// Last updated: 10/8/2026, 10:10:29 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length()-1;
4        int count = 0;
5        while(i>=0 && s.charAt(i) == ' '){
6            i--;
7        }
8        while(i >= 0 && s.charAt(i)!= ' '){
9            count++;
10            i--;
11        } 
12        return count;
13    }
14}