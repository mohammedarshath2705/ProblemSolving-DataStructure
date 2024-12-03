
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
package Math;

public class PowNum {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return quickPow(x, n);
        } else {
            return 1 / quickPow(x, -(long) n);
        }
    }

    private double quickPow(double base, long exponent) {
        double result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        PowNum powNum = new PowNum();

        System.out.println(powNum.myPow(2.0, 10)); // 1024.0
        System.out.println(powNum.myPow(2.1, 3));  // 9.261
        System.out.println(powNum.myPow(2.0, -2)); // 0.25
        System.out.println(powNum.myPow(5.0, 0));  // 1.0
        System.out.println(powNum.myPow(-2.0, 3)); // -8.0
        System.out.println(powNum.myPow(-2.0, 2)); // 4.0
    }
}
