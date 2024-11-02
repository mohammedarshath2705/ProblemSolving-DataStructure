package Strings;

public class AddBinaryStrings {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;

        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            if (indexA >= 0) {
                carry += a.charAt(indexA) - '0';
                indexA--;
            }
            if (indexB >= 0) {
                carry += b.charAt(indexB) - '0';
                indexB--;
            }
            result.append(carry % 2);
            carry /= 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println("Sum: " + addBinary(a, b));
    }
}
