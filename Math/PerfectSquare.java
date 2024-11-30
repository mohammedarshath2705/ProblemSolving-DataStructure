package Math;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (1L * mid * mid >= num) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l * l == num;
    }

    public static void main(String[] args) {
        PerfectSquare ps = new PerfectSquare();
        System.out.println(ps.isPerfectSquare(16)); // true
        System.out.println(ps.isPerfectSquare(14)); // false
        System.out.println(ps.isPerfectSquare(1));  // true
        System.out.println(ps.isPerfectSquare(100)); // true
        System.out.println(ps.isPerfectSquare(99)); // false
        System.out.println(ps.isPerfectSquare(2147483647)); // false
    }
}
