package Math;

public class SumWithoutOper {
    static int sum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 3));     // Expected output: 8
        System.out.println(sum(-4, 6));    // Expected output: 2
        System.out.println(sum(-7, -3));   // Expected output: -10
        System.out.println(sum(0, 0));     // Expected output: 0
        System.out.println(sum(15, 20));   // Expected output: 35
    }
}
