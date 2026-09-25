// Last updated: 9/25/2026, 8:50:56 AM
1class Solution {
2    public List<String> braceExpansionII(String expression) {
3        return dfs(expression, 0, expression.length() - 1);
4    }
5
6    private List<String> dfs(final String expression, int s, int e) {
7        TreeSet<String> ans = new TreeSet<>();
8        List<List<String>> groups = new ArrayList<>();
9        groups.add(new ArrayList<>());
10        int layer = 0;
11        int left = 0;
12
13        for (int i = s; i <= e; ++i)
14            if (expression.charAt(i) == '{' && ++layer == 1)
15                left = i + 1;
16            else if (expression.charAt(i) == '}' && --layer == 0)
17                merge(groups, dfs(expression, left, i - 1));
18            else if (expression.charAt(i) == ',' && layer == 0)
19                groups.add(new ArrayList<>());
20            else if (layer == 0)
21                merge(groups, new ArrayList<>(List.of(String.valueOf(expression.charAt(i)))));
22
23        for (final List<String> group : groups)
24            for (final String word : group)
25                ans.add(word);
26
27        return new ArrayList<>(ans);
28    }
29
30    void merge(List<List<String>> groups, List<String> group) {
31        if (groups.get(groups.size() - 1).isEmpty()) {
32            groups.set(groups.size() - 1, group);
33            return;
34        }
35
36        List<String> mergedGroup = new ArrayList<>();
37
38        for (final String word1 : groups.get(groups.size() - 1))
39            for (final String word2 : group)
40                mergedGroup.add(word1 + word2);
41
42        groups.set(groups.size() - 1, mergedGroup);
43    }
44}