package Arrays;

import java.util.Arrays;

public class MaxNoOfKeyPairs {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int answer = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                answer++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxNoOfKeyPairs solution = new MaxNoOfKeyPairs();
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int result = solution.maxOperations(nums, k);
        System.out.println("Maximum number of pairs with sum " + k + ": " + result);
    }
}
