package graphs;

import java.util.List;

public class CycleDetectionUndirectedGraph {

    boolean hasCycle(int node, int parent, List<List<Integer>> adj, boolean[] visited) {

        visited[node] = true;
        for (int child : adj.get(node)) {
            if (!visited[child]) {
                if (hasCycle(child, node, adj, visited)) {
                    return true;
                }
            } else if (child != parent) {
                return true;
            }
        }
        return false;
    }
}
