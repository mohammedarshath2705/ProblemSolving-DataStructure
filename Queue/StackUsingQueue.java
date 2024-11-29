package Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class StackUsingQueue {

    static class MyStack {
        private Deque<Integer> q1 = new ArrayDeque<>();
        private Deque<Integer> q2 = new ArrayDeque<>();

        public MyStack() {
        }

        public void push(int x) {
            q2.offer(x);
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }
            Deque<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        public int pop() {
            return q1.poll();
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        System.out.println("Top: " + obj.top()); // Output: 20
        System.out.println("Pop: " + obj.pop()); // Output: 20
        System.out.println("Top: " + obj.top()); // Output: 10
        System.out.println("Empty: " + obj.empty()); // Output: false
        obj.pop();
        System.out.println("Empty: " + obj.empty()); // Output: true
    }
}
