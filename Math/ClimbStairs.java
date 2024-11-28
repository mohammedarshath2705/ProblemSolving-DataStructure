/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
package Math;

public class ClimbStairs {
    public int climbStairs(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; ++i) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        System.out.println(cs.climbStairs(2)); // Output: 2
        System.out.println(cs.climbStairs(3)); // Output: 3
        System.out.println(cs.climbStairs(5)); // Output: 8
        System.out.println(cs.climbStairs(10)); // Output: 89
        System.out.println(cs.climbStairs(0)); // Output: 1
    }
}

