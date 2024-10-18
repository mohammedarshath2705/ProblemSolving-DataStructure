
/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.


 */
package Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Highest Altitude (Test 1): " + solution.largestAltitude(gain1));

        // Test case 2
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Highest Altitude (Test 2): " + solution.largestAltitude(gain2));

        // Test case 3
        int[] gain3 = {3, -2, 2, -3};
        System.out.println("Highest Altitude (Test 3): " + solution.largestAltitude(gain3));
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int maxA = 0;
        int currA = 0;
        for (int X : gain) {
            currA += X;
            maxA = Math.max(maxA, currA);
        }
        return maxA;
    }
}
