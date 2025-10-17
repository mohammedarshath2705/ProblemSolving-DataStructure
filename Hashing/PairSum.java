package Hashing;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int sum = 6;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int x : arr) {
            int complement = sum - x;
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        System.out.println("Count of pairs = " + count);
    }
}
