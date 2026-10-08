// Last updated: 10/8/2026, 9:20:33 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder ans = new StringBuilder();
4        int depth = 0;
5        for(char ch : s.toCharArray()){
6            if(ch == '('){
7                if(depth > 0){
8                    ans.append(ch);
9                }
10                depth++;
11            }
12            else{
13                depth--;
14                if(depth>0){
15                    ans.append(ch);
16                }
17            }
18        }
19        return ans.toString();
20    }
21}