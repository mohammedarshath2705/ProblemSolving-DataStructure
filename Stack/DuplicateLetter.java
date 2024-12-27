package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DuplicateLetter {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] last = new int[26];
        for (int i = 0; i < n; ++i) {
            last[s.charAt(i) - 'a'] = i;
        }
        Deque<Character> stk = new ArrayDeque<>();
        int mask = 0;
        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            if (((mask >> (c - 'a')) & 1) == 1) {
                continue;
            }
            while (!stk.isEmpty() && stk.peek() > c && last[stk.peek() - 'a'] > i) {
                mask ^= 1 << (stk.pop() - 'a');
            }
            stk.push(c);
            mask |= 1 << (c - 'a');
        }
        StringBuilder ans = new StringBuilder();
        for (char c : stk) {
            ans.append(c);
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        DuplicateLetter solution = new DuplicateLetter();

        System.out.println(solution.removeDuplicateLetters("cbacdcbc")); // Output: acdb
        System.out.println(solution.removeDuplicateLetters("bcabc"));    // Output: abc
        System.out.println(solution.removeDuplicateLetters("abcd"));     // Output: abcd
        System.out.println(solution.removeDuplicateLetters("ccacbaba")); // Output: acb
        System.out.println(solution.removeDuplicateLetters("aa"));       // Output: a
    }
}
