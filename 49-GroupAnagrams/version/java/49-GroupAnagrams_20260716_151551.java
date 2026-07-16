// Last updated: 7/16/2026, 3:15:51 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> ans = new HashMap<>();
4
5        for (String s : strs) {
6            char[] chars = s.toCharArray();
7            Arrays.sort(chars);
8            String key = new String(chars);
9            if (!ans.containsKey(key)) {
10                ans.put(key, new ArrayList<>());
11            }
12            ans.get(key).add(s);
13        }
14
15        return new ArrayList<>(ans.values());        
16    }
17}