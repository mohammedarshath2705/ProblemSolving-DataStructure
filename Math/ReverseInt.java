package Math;

public class ReverseInt {
    public int reverse(int x) {
        int ans = 0;
        for (; x != 0; x /= 10) {
            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + x % 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.reverse(123));
        System.out.println(reverseInt.reverse(-123));
        System.out.println(reverseInt.reverse(120));
        System.out.println(reverseInt.reverse(0));
        System.out.println(reverseInt.reverse(1534236469)); //Exceeds range
        System.out.println(reverseInt.reverse(-2147483412));
    }
}
