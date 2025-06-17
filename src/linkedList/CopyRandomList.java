package linkedList;

import java.util.HashMap;
import java.util.Map;

class Node {

    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
    }
}

public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

}
