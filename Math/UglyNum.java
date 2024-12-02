
/*
An ugly number is a positive integer
which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number.
 */
package Math;

public class UglyNum {
    public boolean isUgly(int n) {
        if (n < 1) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNum obj = new UglyNum();
        System.out.println(obj.isUgly(6));  // true
        System.out.println(obj.isUgly(8));  // true
        System.out.println(obj.isUgly(14)); // false
        System.out.println(obj.isUgly(1));  // true
        System.out.println(obj.isUgly(30)); // true
    }
}
