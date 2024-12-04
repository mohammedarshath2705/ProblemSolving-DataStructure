package Math;
/*
Given an integer num,
repeatedly add all its digits until the result has only one digit,
 and return it.
 */
public class AddDigits {
    public int addDigits(int num) {
        while (num > 9) {
            int res = 0;
            while (num > 0) {
                res += num % 10;
                num /= 10;
            }
            num = res;
        }
        return num;
    }

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();

        System.out.println(ad.addDigits(38));  // Test case 1
        System.out.println(ad.addDigits(123)); // Test case 2
        System.out.println(ad.addDigits(0));   // Test case 3
        System.out.println(ad.addDigits(9999));// Test case 4
        System.out.println(ad.addDigits(7));   // Test case 5
    }
}
