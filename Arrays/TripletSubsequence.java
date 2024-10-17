
/*
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.


 */
package Arrays;

public class TripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > b) {
                return true;
            }
            if (nums[i] < a) {
                a = nums[i];
            } else if (nums[i] > a && nums[i] < b) {
                b = nums[i];
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TripletSubsequence sol = new TripletSubsequence();

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test case 1: " + sol.increasingTriplet(nums1));

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Test case 2: " + sol.increasingTriplet(nums2));

        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println("Test case 3: " + sol.increasingTriplet(nums3));

        int[] nums4 = {1, 2};
        System.out.println("Test case 4: " + sol.increasingTriplet(nums4));

        int[] nums5 = {-1, 0, 1};
        System.out.println("Test case 5: " + sol.increasingTriplet(nums5));
    }
}
