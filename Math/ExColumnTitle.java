package Math;

/*
Given a positive integer columnNumber, return its corresponding column title
as it appears in an Excel sheet.

Example:
1 -> "A"
2 -> "B"
3 -> "C"
26 -> "Z"
27 -> "AA"
28 -> "AB"
 */

public class ExColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber != 0) {
            columnNumber--; // Adjust to 0-based index
            char currentChar = (char) ('A' + columnNumber % 26);
            result.append(currentChar);
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExColumnTitle obj = new ExColumnTitle();

        System.out.println("1 → " + obj.convertToTitle(1));   // A
        System.out.println("26 → " + obj.convertToTitle(26)); // Z
        System.out.println("27 → " + obj.convertToTitle(27)); // AA
        System.out.println("52 → " + obj.convertToTitle(52)); // AZ
        System.out.println("701 → " + obj.convertToTitle(701)); // ZY
        System.out.println("999 → " + obj.convertToTitle(999));

    }
}
