package Sorting;

public class TwiceLarge {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[k] < nums[i]) {
                k = i;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (k != i && nums[k] < nums[i] * 2) {
                return -1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        TwiceLarge solution = new TwiceLarge();

        int[] test1 = {3, 6, 1, 0};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {0, 0, 3, 6};
        int[] test4 = {1};
        int[] test5 = {6, 6, 6};

        System.out.println(solution.dominantIndex(test1)); // Output: 1
        System.out.println(solution.dominantIndex(test2)); // Output: -1
        System.out.println(solution.dominantIndex(test3)); // Output: 3
        System.out.println(solution.dominantIndex(test4)); // Output: 0
        System.out.println(solution.dominantIndex(test5)); // Output: -1
    }
}
