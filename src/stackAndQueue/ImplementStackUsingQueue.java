package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public Integer pop(){
        return queue1.poll();
    }

    public Integer top(){
        return queue1.peek();
    }


}
