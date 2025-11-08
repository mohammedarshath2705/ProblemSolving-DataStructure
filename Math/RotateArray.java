package Math;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
       RotateArray rot = new RotateArray();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums1));
        rot.rotate(nums1, 3);
        System.out.print("Rotated by 3: ");
        for (int num : nums1) System.out.print(num + " ");
        System.out.println();

        int[] nums2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(nums2));
        rot.rotate(nums2, 2);
        System.out.print("Rotated by 2: ");
        for (int num : nums2) System.out.print(num + " ");
        System.out.println();

        int[] nums3 = {1, 2};
        System.out.println(Arrays.toString(nums3));
        rot.rotate(nums3, 3);
        System.out.print("Rotated by 3: ");
        for (int num : nums3) System.out.print(num + " ");
        System.out.println();
    }
}
