package Streams;

import java.util.Arrays;
import java.util.List;

public class SortNumUsRed {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum = nums.stream().reduce(0,(a,b) -> a + b);

        System.out.println(sum);

    }
}
