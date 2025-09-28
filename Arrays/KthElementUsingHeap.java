package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthElementUsingHeap {

    public static int kthSmallest(int [] arr,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int  x : arr){
            maxHeap.add(x);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }


        }

        return maxHeap.peek();
    }

    public static int kthLargest(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int x : arr){
            minHeap.add(x);

            if(minHeap.size()>k){
                minHeap.poll();
            }


        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("Array: {7, 10, 4, 3, 20, 15}");
        System.out.println("3rd Smallest: " + kthSmallest(arr, k));
        System.out.println("3rd Largest: " + kthLargest(arr, k));

    }
}
