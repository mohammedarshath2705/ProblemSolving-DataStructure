/*
Given a list of non-negative integers nums,
 arrange them such that they form the largest number and return it
Since the result may be very large, so you need to return a string instead of an integer.

Example 1:
Input: nums = [10,2]
Output: "210"
 */



package Strings;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        List<String> vs = new ArrayList<>();
        for (int v : nums) {
            vs.add(v + "");
        }
        vs.sort((a, b) -> (b + a).compareTo(a + b));
        if ("0".equals(vs.get(0))) {
            return "0";
        }
        return String.join("", vs);
    }

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();

        int[][] testCases = {
                {3, 30, 34, 5, 9},      // Test case 1: General Case
                {0, 0, 0, 0},           // Test case 2: All zeros
                {10},                   // Test case 3: Single element
                {10, 2},                // Test case 4: Two numbers
                {1, 11, 111},           // Test case 5: Numbers with different lengths
                {999, 99, 9},           // Test case 6: Edge case with large numbers
                {0, 0, 1},              // Test case 7: Leading zeros in result
                {54, 546, 548, 60},     // Test case 8: Mixed patterns
                {1, 2, 3, 4, 5, 6, 7, 8, 9}, // Test case 9: Consecutive numbers
                {111, 111, 111}         // Test case 10: Same numbers repeated
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] nums = testCases[i];
            String result = ln.largestNumber(nums);
            System.out.println("Test case " + (i + 1) + ": " + result);
        }
    }
}
