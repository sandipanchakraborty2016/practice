package graphs;

import java.util.*;

public class TopologicalSort {

    List<Integer> topologicalSort(int n, List<List<Integer>> adj) {

        int[] inDegree = new int[n];
        for (List<Integer> children : adj) {
            for (int v : children) {
                inDegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for (int child : adj.get(node)) {
                inDegree[child]--;
                if (inDegree[child] == 0) {
                    queue.offer(child);
                }
            }
        }
        if(result.size()!=n){
            return Collections.emptyList();
        }

        return result;
    }
}
