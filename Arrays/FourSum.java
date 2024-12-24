package Arrays;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (n < 4) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long x = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (x < target) {
                        ++k;
                    } else if (x > target) {
                        --l;
                    } else {
                        ans.add(List.of(nums[i], nums[j], nums[k++], nums[l--]));
                        while (k < l && nums[k] == nums[k - 1]) {
                            ++k;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            --l;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FourSum solution = new FourSum();

        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        System.out.println(solution.fourSum(nums1, target1));

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        System.out.println(solution.fourSum(nums2, target2));

        int[] nums3 = {-3, -2, -1, 0, 0, 1, 2, 3};
        int target3 = 0;
        System.out.println(solution.fourSum(nums3, target3));

        int[] nums4 = {1, 1, 1, 1, 1, 1};
        int target4 = 4;
        System.out.println(solution.fourSum(nums4, target4));
    }
}
