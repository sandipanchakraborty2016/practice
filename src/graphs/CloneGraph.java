package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    class Node {
        public int val;
        public List<Node> children;

        public Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        return dfsClone(node, map);
    }

    private Node dfsClone(Node node, Map<Node, Node> map) {
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node clone = new Node(node.val);
        map.put(node, clone);

        for (Node child : node.children) {
            clone.children.add(dfsClone(child, map));
        }
        return clone;
    }


}
