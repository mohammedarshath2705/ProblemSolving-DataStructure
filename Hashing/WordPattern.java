package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between
 * a letter in pattern and a non-empty word in s. Specifically:
 *
 * - Each letter in pattern maps to exactly one unique word in s.
 * - Each unique word in s maps to exactly one letter in pattern.
 * - No two letters map to the same word, and no two words map to the same letter.
 *
 * Example:
 * pattern = "abba", s = "dog cat cat dog" → true
 * pattern = "abba", s = "dog cat cat fish" → false
 */

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];

            if (patternToWord.containsKey(patternChar)) {
                if (!patternToWord.get(patternChar).equals(word)) {
                    return false; // mismatch
                }
            }
            else if (wordToPattern.containsKey(word)) {
                if (wordToPattern.get(word) != patternChar) {
                    return false;
                }
            }

            patternToWord.put(patternChar, word);
            wordToPattern.put(word, patternChar);
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern obj = new WordPattern();

        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern1, s1));

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(obj.wordPattern(pattern2, s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern3, s3));
    }
}
