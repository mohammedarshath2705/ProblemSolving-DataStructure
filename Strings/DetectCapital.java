package Strings;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ++cnt;
            }
        }
        return cnt == 0 || cnt == word.length()
                || (cnt == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        DetectCapital detectCapital = new DetectCapital();

        System.out.println(detectCapital.detectCapitalUse("USA"));  // true
        System.out.println(detectCapital.detectCapitalUse("leetcode"));  // true
        System.out.println(detectCapital.detectCapitalUse("Google"));  // true
        System.out.println(detectCapital.detectCapitalUse("FlAg"));  // false
        System.out.println(detectCapital.detectCapitalUse("gOOgle"));  // false
    }
}
