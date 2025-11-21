package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        int secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Even Numbers: " + even);
        System.out.println("Second Highest Number : " + secondHighest);
    }
}
