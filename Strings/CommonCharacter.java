package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonCharacter {
    public List<String> commonChars(String[] words) {
        int[] cnt = new int[26];
        Arrays.fill(cnt, 20000);
        for (var w : words) {
            int[] t = new int[26];
            for (int i = 0; i < w.length(); ++i) {
                ++t[w.charAt(i) - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                cnt[i] = Math.min(cnt[i], t[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            ans.addAll(Collections.nCopies(cnt[i], String.valueOf((char) ('a' + i))));
        }
        return ans;
    }

    public static void main(String[] args) {
        CommonCharacter commonCharacter = new CommonCharacter();
        String[] words = {"bella", "label", "roller"};
        List<String> result = commonCharacter.commonChars(words);
        System.out.println(result);
    }
}
