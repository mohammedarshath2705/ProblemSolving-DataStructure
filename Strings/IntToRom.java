package Strings;

import java.util.List;

public class IntToRom {
    public String intToRoman(int num) {
        List<String> cs = List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> vs = List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        StringBuilder ans = new StringBuilder();
        for (int i = 0, n = cs.size(); i < n; ++i) {
            while (num >= vs.get(i)) {
                num -= vs.get(i);
                ans.append(cs.get(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        IntToRom converter = new IntToRom();
        System.out.println(converter.intToRoman(3));
        System.out.println(converter.intToRoman(58));
        System.out.println(converter.intToRoman(1994));
        System.out.println(converter.intToRoman(2023));
        System.out.println(converter.intToRoman(3999));
    }
}
