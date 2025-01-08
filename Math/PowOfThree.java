package Math;

public class PowOfThree {
    public boolean isPowerOfThree(int n) {
        while (n > 2) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        PowOfThree powOfThree = new PowOfThree();
        int[] testCases = {1, 3, 9, 27, 81, 0, -3, 10, 243};
        for (int n : testCases) {
            System.out.println("Is " + n + " a power of three? " + powOfThree.isPowerOfThree(n));
        }
    }
}
