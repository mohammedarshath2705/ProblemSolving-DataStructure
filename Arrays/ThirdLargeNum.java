package Arrays;

public class ThirdLargeNum {
    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == m1 || num == m2 || num == m3) {
                continue;
            }
            if (num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = num;
            } else if (num > m2) {
                m3 = m2;
                m2 = num;
            } else if (num > m3) {
                m3 = num;
            }
        }
        return (int) (m3 != Long.MIN_VALUE ? m3 : m1);
    }

    public static void main(String[] args) {
        ThirdLargeNum solution = new ThirdLargeNum();

        int[] test1 = {4, 3, 4, 5};
        int[] test2 = {2, 2, 3, 1};
        int[] test3 = {1, 2};
        int[] test4 = {5, 5, 5, 5, 5};
        int[] test5 = {1, 2, 3, 4, 5};

        System.out.println(solution.thirdMax(test1)); // Output: 3
        System.out.println(solution.thirdMax(test2)); // Output: 1
        System.out.println(solution.thirdMax(test3)); // Output: 2
        System.out.println(solution.thirdMax(test4)); // Output: 5
        System.out.println(solution.thirdMax(test5)); // Output: 3
    }
}
