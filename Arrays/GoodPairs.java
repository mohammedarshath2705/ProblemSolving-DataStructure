package Arrays;

/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] cnt = new int[101];
        for (int x : nums) {
            ans += cnt[x]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        GoodPairs gp = new GoodPairs();

        int[] testCase1 = {1, 2, 3, 1, 1, 3};
        int[] testCase2 = {1, 1, 1, 1};
        int[] testCase3 = {1, 2, 3};
        int[] testCase4 = {3, 3, 3, 3, 2, 2, 1};

        System.out.println("Good pairs in testCase1: " + gp.numIdenticalPairs(testCase1));
        System.out.println("Good pairs in testCase2: " + gp.numIdenticalPairs(testCase2));
        System.out.println("Good pairs in testCase3: " + gp.numIdenticalPairs(testCase3));
        System.out.println("Good pairs in testCase4: " + gp.numIdenticalPairs(testCase4));
    }
}

