package graphs;

import java.util.List;

public class CycleDetectionDirectedGraph {

    boolean hasCycle(int node, List<List<Integer>> adj, boolean[] visited, boolean[] recStack) {

        visited[node] = true;
        recStack[node] = true;

        for (int child : adj.get(node)) {
            if (!visited[child]) {
                hasCycle(child, adj, visited, recStack);

            } else if (recStack[child]) {
                return true;
            }
        }
        recStack[node] = false;
        return false;
    }
}
