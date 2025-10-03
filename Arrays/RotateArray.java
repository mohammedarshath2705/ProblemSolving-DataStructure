package Arrays;

import java.util.Arrays;

public class RotateArray {

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle if k > n

        reverse(nums, 0, n - 1);
        System.out.println("After reversing whole array: " + Arrays.toString(nums));

        reverse(nums, 0, k - 1);
        System.out.println("After reversing first k elements: " + Arrays.toString(nums));

        reverse(nums, k, n - 1);
        System.out.println("After reversing remaining elements: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        System.out.println("Original: " + Arrays.toString(nums1));
        rotate(nums1, 3);
        System.out.println("Final rotated: " + Arrays.toString(nums1));

        System.out.println("\n");

        int[] nums2 = {-1,-100,3,99};
        System.out.println("Original: " + Arrays.toString(nums2));
        rotate(nums2, 2);
        System.out.println("Final rotated: " + Arrays.toString(nums2));

        System.out.println("\n");

        int[] nums3 = {1,2};
        System.out.println("Original: " + Arrays.toString(nums3));
        rotate(nums3, 3);
        System.out.println("Final rotated: " + Arrays.toString(nums3));
    }
}
