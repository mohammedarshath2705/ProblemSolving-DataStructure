package Strings;

/*
Reverse Words in a Sentence (in-place) Reverse word order preserving characters.
 */
public class ReverseWordsInSentence {
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        reverse(arr, 0, n - 1);

        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I love Java"));
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords("One two three"));
    }
}
