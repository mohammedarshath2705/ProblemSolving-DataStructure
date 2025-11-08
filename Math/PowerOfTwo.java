package Math;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfTwo pow = new PowerOfTwo();

        int[] testCases = {1, 2, 3, 8, 12};

        for (int n : testCases) {
            System.out.println("Is " + n + " a power of two? → " + pow.isPowerOfTwo(n));
        }
    }
}
