package Queue;

public class CircularDeque {
    static class MyCircularDeque {
        private int[] q;
        private int front;
        private int size;
        private int capacity;

        public MyCircularDeque(int k) {
            q = new int[k];
            capacity = k;
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }
            if (!isEmpty()) {
                front = (front - 1 + capacity) % capacity;
            }
            q[front] = value;
            ++size;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            int idx = (front + size) % capacity;
            q[idx] = value;
            ++size;
            return true;
        }

        public boolean deleteFront() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % capacity;
            --size;
            return true;
        }

        public boolean deleteLast() {
            if (isEmpty()) {
                return false;
            }
            --size;
            return true;
        }

        public int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return q[front];
        }

        public int getRear() {
            if (isEmpty()) {
                return -1;
            }
            int idx = (front + size - 1) % capacity;
            return q[idx];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }
    }

    public static void main(String[] args) {
        MyCircularDeque deque = new MyCircularDeque(3);

        System.out.println(deque.insertLast(1)); // true
        System.out.println(deque.insertLast(2)); // true
        System.out.println(deque.insertFront(3)); // true
        System.out.println(deque.insertFront(4)); // false
        System.out.println(deque.getRear()); // 2
        System.out.println(deque.isFull()); // true
        System.out.println(deque.deleteLast()); // true
        System.out.println(deque.insertFront(4)); // true
        System.out.println(deque.getFront()); // 4

        MyCircularDeque deque2 = new MyCircularDeque(5);
        System.out.println(deque2.insertLast(10)); // true
        System.out.println(deque2.insertLast(20)); // true
        System.out.println(deque2.getFront()); // 10
        System.out.println(deque2.getRear()); // 20
        System.out.println(deque2.deleteFront()); // true
        System.out.println(deque2.getFront()); // 20
    }
}
