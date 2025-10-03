package Streams;

import java.util.*;

public class SortedAlp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Zara", "John", "Anita", "Bob");

        List<String> firstThree = names.stream()
                .sorted()
                .limit(3)
                .toList();

        System.out.println("First 3 Sorted Names: " + firstThree);
    }
}
