package Strings;

public class GcdOfStrings {
    static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdResult = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdResult);
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABC", "AB"));      // Output: ""
        System.out.println(gcdOfStrings("AAAA", "AA"));     // Output: "AA"
        System.out.println(gcdOfStrings("LEET", "CODE"));   // Output: ""
    }

}
