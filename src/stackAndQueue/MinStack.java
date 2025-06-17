package stackAndQueue;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public int pop() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
