package Math;
/*
Given an integer n,
return the nth digit of the infinite integer sequence
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
 */
public class NthDigit {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        NthDigit solution = new NthDigit();

        System.out.println(solution.findNthDigit(3)); // 3
        System.out.println(solution.findNthDigit(11)); // 0
        System.out.println(solution.findNthDigit(15)); // 2
        System.out.println(solution.findNthDigit(19)); // 4
        System.out.println(solution.findNthDigit(1000)); // 3
    }
}
