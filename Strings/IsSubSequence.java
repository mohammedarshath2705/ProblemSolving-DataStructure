package Strings;

public class IsSubSequence {

    static boolean issubsequence(String s1, String s2)
    {
        int n = s1.length(), m = s2.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == s2.charAt(j)){
                i++;}
            j++;
        }
        /*If i reaches end of s1,that mean we found all
        characters of s1 in s2,
        so s1 is subsequence of s2, else not*/
        return i == n;
    }
    public static void main(String[] args) {
        String s1 = "gksrek";
        String s2 = "geeksforgeeks";
        if (issubsequence(s1, s2))
            System.out.println(
                    "gksrek is subsequence of geekforgeeks");
        else
            System.out.println(
                    "gksrek is not a subsequence of geekforgeeks");
    }
}
