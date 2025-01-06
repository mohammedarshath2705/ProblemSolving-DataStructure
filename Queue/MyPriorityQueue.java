package Queue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class MyPriorityQueue {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MyPriorityQueue() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addMinHeap(int value) {
        minHeap.add(value);
    }

    public int pollMinHeap() {
        return minHeap.poll();
    }

    public int peekMinHeap() {
        return minHeap.peek();
    }

    public void addMaxHeap(int value) {
        maxHeap.add(value);
    }

    public int pollMaxHeap() {
        return maxHeap.poll();
    }

    public int peekMaxHeap() {
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        MyPriorityQueue pq = new MyPriorityQueue();
        pq.addMinHeap(10);
        pq.addMinHeap(5);
        pq.addMinHeap(20);
        System.out.println(pq.peekMinHeap());
        System.out.println(pq.pollMinHeap());
        System.out.println(pq.pollMinHeap());
        pq.addMaxHeap(10);
        pq.addMaxHeap(5);
        pq.addMaxHeap(20);
        System.out.println(pq.peekMaxHeap());
        System.out.println(pq.pollMaxHeap());
        System.out.println(pq.pollMaxHeap());
    }
}
