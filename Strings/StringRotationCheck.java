package Strings;

public class StringRotationCheck {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String combined = s1 + s1;
        return combined.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("hello", "lohel"));
        System.out.println(isRotation("hello", "olehl"));
        System.out.println(isRotation("abcde", "cdeab"));
        System.out.println(isRotation("abc", "abcd"));
    }
}
