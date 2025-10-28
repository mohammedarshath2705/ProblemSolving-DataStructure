package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a string containing digits from 2-9 inclusive,
return all possible letter combinations that the number could represent.
Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) .
Note that 1 does not map to any letters.
 2 -> a, b, c
3 -> d, e, f
4 -> g, h, i
5 -> j, k, l
6 -> m, n, o
7 -> p, q, r, s
8 -> t, u, v
9 -> w, x, y, z

 */
public class LetterComb {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(result, map, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, Map<Character, String> map, String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (char c : letters.toCharArray()) {
            path.append(c);
            backtrack(result, map, digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

    // for quick test
    public static void main(String[] args) {

        LetterComb let = new LetterComb();

        System.out.println(let.letterCombinations("23"));
        System.out.println(let.letterCombinations("2"));
        System.out.println(let.letterCombinations(""));
        System.out.println(let.letterCombinations("45"));
    }
}
