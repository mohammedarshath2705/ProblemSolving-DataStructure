package Sorting;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();

        String[][] tests = {
                {"anagram", "nagaram"},
                {"rat", "car"},
                {"listen", "silent"},
                {"abc", "bca"},
                {"hello", "holle"}
        };

        for (String[] pair : tests) {
            System.out.println(pair[0] + " & " + pair[1] + " → " + validAnagram.isAnagram(pair[0], pair[1]));
        }
    }
}
