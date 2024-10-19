package Arrays;

public class ProductOfArray {

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] prod = new int[n];

            prod[0] = 1;
            for (int i = 1; i < n; i++) {
                prod[i] = nums[i - 1] * prod[i - 1];
            }

            int right = 1;
            for (int i = n - 1; i >= 0; i--) {
                prod[i] = prod[i] * right;
                right = right * nums[i];
            }

            return prod;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(nums);

        System.out.print("Product array except self: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
