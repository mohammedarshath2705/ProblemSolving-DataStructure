import java.util.Stack;

public class QueueUsingStack {
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enQueue(int x) {
        stack1.push(x);
    }

    public int deQueue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(5);
        queue.enQueue(4);

        System.out.print(queue.deQueue() + " ");
        System.out.print(queue.deQueue() + " ");
        System.out.print(queue.deQueue() + " ");
        System.out.print(queue.deQueue() + " ");
        System.out.print(queue.deQueue() + " ");
        System.out.println(queue.deQueue() + " ");
    }
}
