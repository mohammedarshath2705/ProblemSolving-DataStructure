/*
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */

package Math;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {
    public boolean isHappy(int n) {
        Set<Integer> vis = new HashSet<>();
        while (n != 1 && !vis.contains(n)) {
            vis.add(n);
            int x = 0;
            while (n != 0) {
                x += (n % 10) * (n % 10);
                n /= 10;
            }
            n = x;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        HappyNum happyNum = new HappyNum();
        System.out.println(happyNum.isHappy(19));  // true
        System.out.println(happyNum.isHappy(2));   // false
        System.out.println(happyNum.isHappy(7));   // true
        System.out.println(happyNum.isHappy(20));  // false
        System.out.println(happyNum.isHappy(1));   // true
    }
}
