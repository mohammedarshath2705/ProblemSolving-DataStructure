/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only
 */
package Strings;

public class LengthLastWord {

    public int lengthOfLastWord(String s) {
        int endIndex = s.length() - 1;

        // Skip trailing spaces
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }

        int startIndex = endIndex;

        // Find the start of the last word
        while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
            startIndex--;
        }

        // Return the length of the last word
        return endIndex - startIndex;
    }

    public static void main(String[] args) {
        LengthLastWord solution = new LengthLastWord();

        String testString = "Hello World  ";
        int length = solution.lengthOfLastWord(testString);

        System.out.println("Length of the last word: " + length);  // Output should be 5
    }
}
