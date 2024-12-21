package Hashing;

import java.util.*;

public class ValidAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> d = new HashMap<>();
        for (String s : strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String k = String.valueOf(t);
            d.computeIfAbsent(k, key -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(d.values());
    }

    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        String[] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] test2 = {"", ""};
        String[] test3 = {"a"};
        String[] test4 = {"bob", "boo", "obo", "obo", "obb"};
        System.out.println(obj.groupAnagrams(test1));
        System.out.println(obj.groupAnagrams(test2));
        System.out.println(obj.groupAnagrams(test3));
        System.out.println(obj.groupAnagrams(test4));
    }
}
