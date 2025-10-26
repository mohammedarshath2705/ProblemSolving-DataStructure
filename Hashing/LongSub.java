package Hashing;

import java.util.HashMap;

public class LongSub {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }


            map.put(c, i);

            int windowLength = i - start + 1;
            maxLength = Math.max(maxLength, windowLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }
}
