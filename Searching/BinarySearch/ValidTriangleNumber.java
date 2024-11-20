package Searching.BinarySearch;

import java.util.Arrays;

public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = n - 1; i >= 2; --i) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    res += r - l;
                    --r;
                } else {
                    ++l;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ValidTriangleNumber solution = new ValidTriangleNumber();

        int[] nums1 = {2, 2, 3, 4};
        System.out.println("Test case 1: " + solution.triangleNumber(nums1)); // Expected: 3

        int[] nums2 = {4, 2, 3, 4};
        System.out.println("Test case 2: " + solution.triangleNumber(nums2)); // Expected: 4

        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Test case 3: " + solution.triangleNumber(nums3)); // Expected: 4

        int[] nums4 = {0, 0, 0, 0};
        System.out.println("Test case 4: " + solution.triangleNumber(nums4)); // Expected: 0

        int[] nums5 = {6, 10, 15, 25};
        System.out.println("Test case 5: " + solution.triangleNumber(nums5)); // Expected: 2

        int[] nums6 = {5, 3, 2};
        System.out.println("Test case 6: " + solution.triangleNumber(nums6)); // Expected: 1

        int[] nums7 = {7};
        System.out.println("Test case 7: " + solution.triangleNumber(nums7)); // Expected: 0

        int[] nums8 = {};
        System.out.println("Test case 8: " + solution.triangleNumber(nums8)); // Expected: 0
    }
}
