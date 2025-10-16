package Hashing;

import java.util.HashMap;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "Volatile";
//        String s = "tata";

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                System.out.println("First unique: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No unique character.");
    }
}
