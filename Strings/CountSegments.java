package Strings;

public class CountSegments {
    public int countSegments(String s) {
        int ans = 0;
        for (String t : s.split(" ")) {
            if (!"".equals(t)) {
                ++ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CountSegments cs = new CountSegments();
        String[] testCases = {
                "Hello, how are you?",
                "   This   is  a   test   ",
                "",
                "OneWord",
                "    Multiple    spaces    "
        };

        for (String test : testCases) {
            int result = cs.countSegments(test);
            System.out.println("Input: \"" + test + "\", Segments: " + result);
        }
    }
}
