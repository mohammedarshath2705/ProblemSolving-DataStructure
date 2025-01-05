package Strings;
/*
Given a string text,you want to use the characters of text to form
as many instances of the word "balloon" as possible.
You can use each character in text at most once.
Return the maximum number of instances that can be formed.
 */
public class MaxNoOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[26];
        for (int i = 0; i < text.length(); ++i) {
            ++cnt[text.charAt(i) - 'a'];
        }
        cnt['l' - 'a'] >>= 1;
        cnt['o' - 'a'] >>= 1;
        int ans = Integer.MAX_VALUE;
        for (char c : "balon".toCharArray()) {
            ans = Math.min(ans, cnt[c - 'a']);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxNoOfBalloons obj = new MaxNoOfBalloons();
        System.out.println(obj.maxNumberOfBalloons("nlaebolko")); // Output: 1
        System.out.println(obj.maxNumberOfBalloons("loonbalxballpoon")); // Output: 2
        System.out.println(obj.maxNumberOfBalloons("leetcode")); // Output: 0
        System.out.println(obj.maxNumberOfBalloons("balloonballoonballoon")); // Output: 3
        System.out.println(obj.maxNumberOfBalloons("balloon")); // Output: 1
    }
}
