package graphs;

import java.util.ArrayList;
import java.util.List;

public class NumberOfConnectedComponents {

    int countComponents(int n, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, adj, visited);
            }
        }
        return count;
    }

    void dfs(int node, List<List<Integer>> adjLists, boolean[] visited) {

        visited[node] = true;

        for (int child : adjLists.get(node)) {
            if (!visited[child]) {
                dfs(node, adjLists, visited);
            }
        }
    }
}
