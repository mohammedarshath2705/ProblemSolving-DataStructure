/*
A perfect number is a positive integer that is equal to the sum of its positive divisors,
 excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.
 */


package Math;

public class PerfectNum {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int s = 1;
        for (int i = 2; i <= num / i; ++i) {
            if (num % i == 0) {
                s += i;
                if (i != num / i) {
                    s += num / i;
                }
            }
        }
        return s == num;
    }

    public static void main(String[] args) {
        PerfectNum perfectNum = new PerfectNum();

        int[] testCases = {6, 28, 496, 8128, 2, 12, 1,7};
        for (int num : testCases) {
            System.out.println("Is " + num + " a perfect number? " + perfectNum.checkPerfectNumber(num));
        }
    }
}
