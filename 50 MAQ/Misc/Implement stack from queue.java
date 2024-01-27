import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    // Push element x onto the stack.
    public void push(int x) {
        int size = queue.size();
        queue.add(x);

        // Rotate the queue to make the recently added element at the front
        for (int i = 0; i < size; i++) {
            int front = queue.poll();
            queue.add(front);
        }
    }

    // Removes the element on the top of the stack and returns it.
    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.poll();
    }

    // Get the top element.
    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();
    }

    // Returns whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Is stack empty? " + stack.empty()); // Output: false

        stack.push(4);
        System.out.println("Top element: " + stack.top()); // Output: 4
    }
}
