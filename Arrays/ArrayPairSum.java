package Arrays;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }

    // Driver code to test multiple test cases
    public static void main(String[] args) {
        ArrayPairSum aps = new ArrayPairSum();

        // Test case 1
        int[] nums1 = {1, 4, 3, 2};
        System.out.println("Test case 1: " + aps.arrayPairSum(nums1)); // Expected: 4

        // Test case 2
        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println("Test case 2: " + aps.arrayPairSum(nums2)); // Expected: 9

        // Test case 3
        int[] nums3 = {7, 3, 1, 0, 0, 6};
        System.out.println("Test case 3: " + aps.arrayPairSum(nums3)); // Expected: 7

        // Test case 4 (Edge case)
        int[] nums4 = {1, 1};
        System.out.println("Test case 4: " + aps.arrayPairSum(nums4)); // Expected: 1

        // Test case 5 (All same elements)
        int[] nums5 = {5, 5, 5, 5};
        System.out.println("Test case 5: " + aps.arrayPairSum(nums5)); // Expected: 10
    }
}
