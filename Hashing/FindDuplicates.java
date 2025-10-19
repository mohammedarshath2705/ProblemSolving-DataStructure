package Hashing;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,2,5,1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int x : arr) {
            if (!seen.add(x)) {
                duplicates.add(x);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
