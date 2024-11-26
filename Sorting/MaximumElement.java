/*
Given the array of integers nums,
 you will choose two different indices i and j of that array.
 Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */

package Sorting;

import java.util.Arrays;

public class MaximumElement {
    public int maxProduct(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] frequencyArray = new int[max + 1];
        for (int num : nums) {
            frequencyArray[num]++;
        }
        int index = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            while (frequencyArray[i] > 0) {
                nums[index] = i;
                index++;
                frequencyArray[i]--;
            }
        }
        int n = nums.length - 1;
        return (nums[n] - 1) * (nums[n - 1] - 1);
    }

    public static void main(String[] args) {
        MaximumElement obj = new MaximumElement();

        int[] test1 = {3, 4, 5, 2};
        System.out.println(obj.maxProduct(test1)); // Output: 12

        int[] test2 = {1, 5, 4, 5};
        System.out.println(obj.maxProduct(test2)); // Output: 16

        int[] test3 = {10, 2, 5, 2, 8};
        System.out.println(obj.maxProduct(test3)); // Output: 72

        int[] test4 = {1, 1, 1, 1};
        System.out.println(obj.maxProduct(test4)); // Output: 0

        int[] test5 = {2, 7, 3, 9, 4};
        System.out.println(obj.maxProduct(test5)); // Output: 48
    }
}

