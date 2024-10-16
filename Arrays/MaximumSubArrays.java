package Arrays;
/*
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaximumSubArrays {
    static class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int n = nums.length;
            if (n < k) {
                return -1;  // Return -1 if it's not possible to form a subarray of length k
            }

            int maxSum = 0;
            for (int i = 0; i < k; i++) {
                maxSum += nums[i];  // Calculate the sum of the first 'k' elements
            }
            double maxAvg = (double) maxSum / k;  // Initialize maxAvg with the first subarray's average

            int windowSum = maxSum;
            for (int i = k; i < n; i++) {
                windowSum += nums[i] - nums[i - k];  // Update the sliding window sum
                double windowAvg = (double) windowSum / k;  // Calculate the new average
                maxAvg = Math.max(maxAvg, windowAvg);  // Update maxAvg if we find a larger average
            }

            return maxAvg;  // Return the maximum average
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Regular array with positive numbers
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Maximum average for test case 1: " + solution.findMaxAverage(nums1, k1));

        // Test Case 2: All positive numbers
        int[] nums2 = {5, 5, 5, 5};
        int k2 = 2;
        System.out.println("Maximum average for test case 2: " + solution.findMaxAverage(nums2, k2));

        // Test Case 3: All negative numbers
        int[] nums3 = {-10, -20, -30, -40};
        int k3 = 2;
        System.out.println("Maximum average for test case 3: " + solution.findMaxAverage(nums3, k3));

        // Test Case 4: Array with fewer elements than k
        int[] nums4 = {5, 3};
        int k4 = 3;
        System.out.println("Maximum average for test case 4: " + solution.findMaxAverage(nums4, k4));

        // Test Case 5: Array of length 1 with k = 1
        int[] nums5 = {7};
        int k5 = 1;
        System.out.println("Maximum average for test case 5: " + solution.findMaxAverage(nums5, k5));
    }
}
