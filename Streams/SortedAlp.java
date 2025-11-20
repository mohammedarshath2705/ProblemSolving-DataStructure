package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortedAlp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Zara", "John", "Anita", "Bob", "Edward");

        List<String> firstThree = names.stream()
                .sorted()
                .limit(3)
                .toList();

        List<String> result = names.stream()
                        .filter(n->n.startsWith("A"))
                .toList();

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();

        Map<Character, Long> freq =
                "zara".chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        List<String> result2 = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        List<String> result3 = names.stream()
                .filter(s -> "AEIOUaeiou".indexOf(s.charAt(0)) >= 0)
                .toList();


        System.out.println("First 3 Sorted Names: " + firstThree);
        System.out.println("Names starts with A: " + result);
        System.out.println("To Uppercase: " + upper);
        System.out.println("Frequency of characters in a string: " + freq);
        System.out.println("Reverse Order : " +result2);
        System.out.println("Names starts with Vowel: " + result3);

    }
}
