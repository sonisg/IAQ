import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1; // Used for enqueue operations
    private Stack<Integer> stack2; // Used for dequeue operations

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element x to the back of the queue.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from the front of the queue and returns it.
    public int pop() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 in reverse order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }

    // Returns the element at the front of the queue.
    public int peek() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 in reverse order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.peek();
    }

    // Returns true if the queue is empty, false otherwise.
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Front element: " + queue.peek()); // Output: 1
        System.out.println("Dequeued element: " + queue.pop()); // Output: 1
        System.out.println("Is queue empty? " + queue.empty()); // Output: false

        queue.push(4);
        System.out.println("Front element: " + queue.peek()); // Output: 2
    }
}
