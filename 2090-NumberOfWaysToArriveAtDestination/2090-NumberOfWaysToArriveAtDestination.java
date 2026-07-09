// Last updated: 7/9/2026, 3:09:45 PM
import java.util.*;

class Solution {
    public int countPaths(int n, int[][] roads) {

        long MOD = 1_000_000_007L;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int w = road[2];

            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        long[] ways = new long[n];

        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        dist[0] = 0;
        ways[0] = 1;

        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {

            long[] curr = pq.poll();

            long currDist = curr[0];
            int node = (int) curr[1];

            if (currDist > dist[node]) {
                continue;
            }

            for (int[] neighbor : graph[node]) {

                int next = neighbor[0];
                int weight = neighbor[1];

                long newDist = currDist + weight;

                if (newDist < dist[next]) {

                    dist[next] = newDist;
                    ways[next] = ways[node];

                    pq.offer(new long[]{newDist, next});

                } else if (newDist == dist[next]) {

                    ways[next] =
                            (ways[next] + ways[node]) % MOD;
                }
            }
        }

        return (int) ways[n - 1];
    }
}