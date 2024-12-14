package Queue;
/*
Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.
 */
public class UniqueChar {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        UniqueChar uniqueChar = new UniqueChar();

        String[] testCases = {
                "leetcode",
                "loveleetcode",
                "aabbcc",
                "helloworld",
                "",
                "abcabcddedf"
        };

        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> First Unique Index: " + uniqueChar.firstUniqChar(testCase));
        }
    }
}
