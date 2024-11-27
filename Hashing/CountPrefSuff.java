package Hashing;

import java.util.*;

public class CountPrefSuff {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        Map<String, List<Integer>> wordMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            wordMap.putIfAbsent(words[i], new ArrayList<>());
            wordMap.get(words[i]).add(i);
        }

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            for (int k = 1; k <= word.length(); k++) {
                String prefixSuffix = word.substring(0, k);
                if (wordMap.containsKey(prefixSuffix)) {
                    for (int i : wordMap.get(prefixSuffix)) {
                        if (i < j && isPrefixAndSuffix(prefixSuffix, word)) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2) return false;
        if (!str2.substring(0, len1).equals(str1)) return false;
        return str2.substring(len2 - len1).equals(str1);
    }

    public static void main(String[] args) {
        CountPrefSuff cps = new CountPrefSuff();

        String[] words1 = {"a", "aba", "ababa", "aa"};
        System.out.println(cps.countPrefixSuffixPairs(words1)); // Output: 4

        String[] words2 = {"pa", "papa", "ma", "mama"};
        System.out.println(cps.countPrefixSuffixPairs(words2)); // Output: 2

        String[] words3 = {"abab", "ab"};
        System.out.println(cps.countPrefixSuffixPairs(words3)); // Output: 0

        String[] words4 = {"a", "abb"};
        System.out.println(cps.countPrefixSuffixPairs(words4)); // Output: 0

        String[] words5 = {"hello", "he", "lo", "hellolo"};
        System.out.println(cps.countPrefixSuffixPairs(words5)); // Output: 1
    }
}
