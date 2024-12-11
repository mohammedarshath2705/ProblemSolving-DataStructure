package Searching.BinarySearch;

public class DupNum {
    public int findDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int v : nums) {
                if (v <= mid) {
                    ++cnt;
                }
            }
            if (cnt > mid) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        DupNum dupNum = new DupNum();

        int[] testCase1 = {1, 3, 4, 2, 2};
        int[] testCase2 = {3, 1, 3, 4, 2};
        int[] testCase3 = {1, 1};
        int[] testCase4 = {1, 2, 2, 3, 4};

        System.out.println("Duplicate in testCase1: " + dupNum.findDuplicate(testCase1));
        System.out.println("Duplicate in testCase2: " + dupNum.findDuplicate(testCase2));
        System.out.println("Duplicate in testCase3: " + dupNum.findDuplicate(testCase3));
        System.out.println("Duplicate in testCase4: " + dupNum.findDuplicate(testCase4));
    }
}
