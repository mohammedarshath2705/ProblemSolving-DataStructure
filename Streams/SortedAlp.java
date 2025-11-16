package Streams;

import java.util.*;

public class SortedAlp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Zara", "John", "Anita", "Bob");

        List<String> firstThree = names.stream()
                .sorted()
                .limit(3)
                .toList();

        List<String> result = names.stream()
                        .filter(n->n.startsWith("A"))
                .toList();

        System.out.println("First 3 Sorted Names: " + firstThree);
        System.out.println("Names starts with A: " + result);
    }
}
