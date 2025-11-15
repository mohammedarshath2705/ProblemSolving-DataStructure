package Hashing;
/*
Given a string s and an integer k, return the length of the longest substring of s
such that the frequency of each character in this substring is greater than or equal to k.
if no such substring exists, return 0.
 */
import java.util.*;

public class LongestSubstringWithKRepeats {

    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length() - 1, k);
    }

    private int helper(String s, int start, int end, int k) {
        if (end - start + 1 < k) return 0;

        // Frequency map for this substring
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int mid = start; mid <= end; mid++) {
            char c = s.charAt(mid);
            if (freq.get(c) < k) {
                int left = helper(s, start, mid - 1, k);
                int right = helper(s, mid + 1, end, k);
                return Math.max(left, right);
            }
        }

        return end - start + 1;
    }

    public static void main(String[] args) {
        LongestSubstringWithKRepeats solver = new LongestSubstringWithKRepeats();

        // Test Case 1
        String s1 = "aaabb";
        int k1 = 3;
        System.out.println("Test 1 Output: " + solver.longestSubstring(s1, k1));

        // Test Case 2
        String s2 = "ababbc";
        int k2 = 2;
        System.out.println("Test 2 Output: " + solver.longestSubstring(s2, k2));

        // Test Case 3
        String s3 = "weittttcode";
        int k3 = 2;
        System.out.println("Test 3 Output: " + solver.longestSubstring(s3, k3));
    }
}
