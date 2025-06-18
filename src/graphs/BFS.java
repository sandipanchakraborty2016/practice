package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    void bfs(int start, List<List<Integer>> adj, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int child : adj.get(node)) {
                if (!visited[child]) {
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
    }
}
