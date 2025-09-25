package Arrays;

import java.util.Arrays;

public class FindMissingNumber {
    public static int missingNumberSum(int[] arr) {
        int n = arr.length;
        long expected = (long) n * (n + 1) / 2;
        long actual = 0;
        for (int x : arr) actual += x;
        return (int) (expected - actual);
    }

    public static void main(String[] args) {
        int[][] tests = {
                {3, 0, 1},
                {0, 1, 2, 4, 5},
                {1},
                {0},
                {9,8,6,4,5,7,1,0,2}
        };

        System.out.println("Using Sum method:");
        for (int[] t : tests) {
            System.out.println(Arrays.toString(t) + " -> " + missingNumberSum(t));
        }
    }
}
