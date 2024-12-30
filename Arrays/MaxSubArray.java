package Arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxSum = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], nums[i] + currentMax);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();

        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] test2 = {1};
        int[] test3 = {5, 4, -1, 7, 8};
        int[] test4 = {-1, -2, -3, -4};
        int[] test5 = {2, -1, 2, 3, -9, 4, 7};

        System.out.println(solution.maxSubArray(test1));
        System.out.println(solution.maxSubArray(test2));
        System.out.println(solution.maxSubArray(test3));
        System.out.println(solution.maxSubArray(test4));
        System.out.println(solution.maxSubArray(test5));
    }
}
