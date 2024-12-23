package Queue;

public class CircularQueue {
    static class MyCircularQueue {
        private int[] q;
        private int front;
        private int size;
        private int capacity;

        public MyCircularQueue(int k) {
            q = new int[k];
            capacity = k;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            int idx = (front + size) % capacity;
            q[idx] = value;
            ++size;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % capacity;
            --size;
            return true;
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return q[front];
        }

        public int Rear() {
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
        MyCircularQueue circularQueue = new MyCircularQueue(3);

        System.out.println(circularQueue.enQueue(10)); // true
        System.out.println(circularQueue.enQueue(20)); // true
        System.out.println(circularQueue.enQueue(30)); // true
        System.out.println(circularQueue.enQueue(40)); // false
        System.out.println(circularQueue.Rear()); // 30
        System.out.println(circularQueue.isFull()); // true
        System.out.println(circularQueue.deQueue()); // true
        System.out.println(circularQueue.enQueue(40)); // true
        System.out.println(circularQueue.Rear()); // 40

        MyCircularQueue queue2 = new MyCircularQueue(5);
        System.out.println(queue2.deQueue()); // false
        System.out.println(queue2.Front()); // -1
        System.out.println(queue2.Rear()); // -1
        System.out.println(queue2.enQueue(5)); // true
        System.out.println(queue2.enQueue(15)); // true
        System.out.println(queue2.Front()); // 5
        System.out.println(queue2.Rear()); // 15
        System.out.println(queue2.deQueue()); // true
        System.out.println(queue2.Front()); // 15
    }
}
