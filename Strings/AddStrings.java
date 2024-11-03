package Strings;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);

        int len = Math.max(sb1.length(), sb2.length());
        sb1.reverse();
        sb2.reverse();

        int carry = 0;
        for (int i = 0; i < len; i++) {
            int d1 = i < sb1.length() ? sb1.charAt(i) - '0' : 0;
            int d2 = i < sb2.length() ? sb2.charAt(i) - '0' : 0;

            int sum = d1 + d2 + carry;
            answer.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            answer.append(carry);
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "789";
        String result = addStrings(num1, num2);
        System.out.println("Sum: " + result);  // Output: Sum: 1245
    }
}
