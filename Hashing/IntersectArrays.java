package Hashing;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays.
You may return the result in any order.
*/
import java.util.*;

public class IntersectArrays {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        IntersectArrays ia = new IntersectArrays();

        int[] nums1a = {1, 2, 2, 1};
        int[] nums2a = {2, 2};
        System.out.println("Test 1 Output: " + Arrays.toString(ia.intersect(nums1a, nums2a)));

        int[] nums1b = {4, 9, 5};
        int[] nums2b = {9, 4, 9, 8, 4};
        System.out.println("Test 2 Output: " + Arrays.toString(ia.intersect(nums1b, nums2b)));

        int[] nums1c = {3, 1, 2};
        int[] nums2c = {1, 1};
        System.out.println("Test 3 Output: " + Arrays.toString(ia.intersect(nums1c, nums2c)));
    }
}
