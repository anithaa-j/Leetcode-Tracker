// Last updated: 7/19/2026, 10:55:40 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] freq = new int[26];
4        boolean[] visited = new boolean[26];
5
6        // Count frequency of each character
7        for(char c : s.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        Stack<Character> stack = new Stack<>();
12
13        for(char c : s.toCharArray()) {
14
15            // One occurrence of c is being processed
16            freq[c - 'a']--;
17
18            // Skip if already present
19            if(visited[c - 'a'])
20                continue;
21
22            // Remove bigger characters if they appear later
23            while(!stack.isEmpty() &&
24                  stack.peek() > c &&
25                  freq[stack.peek() - 'a'] > 0) {
26
27                visited[stack.pop() - 'a'] = false;
28            }
29
30            stack.push(c);
31            visited[c - 'a'] = true;
32        }
33
34        StringBuilder ans = new StringBuilder();
35
36        for(char ch : stack)
37            ans.append(ch);
38
39        return ans.toString();
40    }
41}