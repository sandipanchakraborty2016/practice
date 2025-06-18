package graphs;

import java.util.List;

public class DFS {

    void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int child : adj.get(node)) {
            if (!visited[child]) {
                dfs(child, adj, visited);
            }
        }
    }
}
