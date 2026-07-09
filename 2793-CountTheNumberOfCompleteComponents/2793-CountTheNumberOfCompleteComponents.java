// Last updated: 7/9/2026, 3:06:17 PM
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        boolean[] vis = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {

                int[] info = dfs(i, graph, vis);

                int nodes = info[0];
                int edgeCount = info[1] / 2;

                if (edgeCount == nodes * (nodes - 1) / 2) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private int[] dfs(int node, List<Integer>[] graph, boolean[] vis) {
        vis[node] = true;

        int nodes = 1;
        int degreeSum = graph[node].size();

        for (int nei : graph[node]) {
            if (!vis[nei]) {
                int[] res = dfs(nei, graph, vis);
                nodes += res[0];
                degreeSum += res[1];
            }
        }

        return new int[]{nodes, degreeSum};
    }
}