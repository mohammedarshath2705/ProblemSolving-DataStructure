package Strings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray() ){
            if(!map.containsKey(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses val = new ValidParentheses();

        String[] tests = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}",
                "((({{{[[[]]]}}})))",
                "([{}])",
                "("
        };

        for (String s : tests) {
            System.out.println(s + " → " + val.isValid(s));
        }
    }
}
