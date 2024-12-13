/*
You are given a string s.
Your task is to remove all digits by doing this operation repeatedly:
Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
 */


package Stack;
public class ClearDigits {
    public String clearDigits(String s) {
        StringBuilder stk = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (stk.length() > 0) {
                    stk.deleteCharAt(stk.length() - 1);
                }
            } else {
                stk.append(c);
            }
        }
        return stk.toString();
    }

    public static void main(String[] args) {
        ClearDigits obj = new ClearDigits();

        String test1 = "a2bc3d";
        String test2 = "12345";
        String test3 = "abc123xyz";
        String test4 = "x1y2z3";
        String test5 = "abcd";

        System.out.println(obj.clearDigits(test1)); // Expected: "ad"
        System.out.println(obj.clearDigits(test2)); // Expected: ""
        System.out.println(obj.clearDigits(test3)); // Expected: "axyz"
        System.out.println(obj.clearDigits(test4)); // Expected: ""
        System.out.println(obj.clearDigits(test5)); // Expected: "abcd"
    }
}
