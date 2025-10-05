package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,3,4,4,5);

        List<Integer> squares = nums.stream().distinct().map(n -> n*n).toList();

        System.out.println(squares);
    }
}
