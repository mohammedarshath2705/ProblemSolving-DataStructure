package Searching.LinearSearch;

public class BasicSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 8, 4};
        System.out.println(search(nums, 8));
        System.out.println(search(nums, 1));
    }
}
