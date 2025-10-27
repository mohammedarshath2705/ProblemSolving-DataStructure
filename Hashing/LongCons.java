package Hashing;

import java.util.HashSet;

public class LongCons {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int [] nums1 = {100,4,200,1,3,2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {1, 0, 1, 2};

        System.out.println("Test 1: " + longestConsecutive(nums1));
        System.out.println("Test 2: " + longestConsecutive(nums2));
        System.out.println("Test 3: " + longestConsecutive(nums3));
    }
}
