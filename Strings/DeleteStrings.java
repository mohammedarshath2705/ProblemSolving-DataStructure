/*
Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.

In one step, you can delete exactly one character in either string.


 */

package Strings;

public class DeleteStrings {
    public int minDistance(String word1, String word2) {
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        int[][] dp = new int[lenWord1 + 1][lenWord2 + 1];

        for (int i = 1; i <= lenWord1; ++i) {
            dp[i][0] = i;
        }

        for (int j = 1; j <= lenWord2; ++j) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= lenWord1; ++i) {
            for (int j = 1; j <= lenWord2; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[lenWord1][lenWord2];
    }

    public static void main(String[] args) {
        DeleteStrings deleteStrings = new DeleteStrings();
        String word1 = "intention";
        String word2 = "execution";
        System.out.println("Minimum edit distance: " + deleteStrings.minDistance(word1, word2));
    }
}
