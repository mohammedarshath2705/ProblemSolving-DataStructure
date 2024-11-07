package Stack;

public class LinklistImplement {

    private class Node {
        int data;
        Node link;
    }

    private Node top;

    public LinklistImplement() {
        this.top = null;
    }

    public void push(int x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
        System.out.println(x + " pushed to stack");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.link;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.link;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinklistImplement stack = new LinklistImplement();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        stack.display();
        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        stack.display();
        System.out.println("Top element is: " + stack.peek());
    }
}
