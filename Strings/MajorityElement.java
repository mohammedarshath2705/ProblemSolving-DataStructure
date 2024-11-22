package Strings;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();

        int[] test1 = {2, 2, 4, 4, 4, 3, 4};
        int[] test2 = {1, 1, 1, 2, 3, 1, 4};
        int[] test3 = {5, 5, 5, 5, 2, 2, 5};
        int[] test4 = {6, 6, 6, 6, 6, 1, 2};
        int[] test5 = {7};

        System.out.println("Majority Element (Test 1): " + obj.majorityElement(test1)); // Output: 4
        System.out.println("Majority Element (Test 2): " + obj.majorityElement(test2)); // Output: 1
        System.out.println("Majority Element (Test 3): " + obj.majorityElement(test3)); // Output: 5
        System.out.println("Majority Element (Test 4): " + obj.majorityElement(test4)); // Output: 6
        System.out.println("Majority Element (Test 5): " + obj.majorityElement(test5)); // Output: 7
    }
}
