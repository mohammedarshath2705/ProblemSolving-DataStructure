package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api", "rocks");

        List<String> sorted = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(sorted);

    }
}
