package Arrays;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        int[] digits1 = {1, 9, 9};
        int[] result1 = solution.plusOne(digits1);
        System.out.println("Input: [1, 9, 9] => Output: " + Arrays.toString(result1));

        int[] digits2 = {9, 9, 9};
        int[] result2 = solution.plusOne(digits2);
        System.out.println("Input: [9, 9, 9] => Output: " + Arrays.toString(result2));

        int[] digits3 = {1, 2, 3};
        int[] result3 = solution.plusOne(digits3);
        System.out.println("Input: [1, 2, 3] => Output: " + Arrays.toString(result3));
    }
}
