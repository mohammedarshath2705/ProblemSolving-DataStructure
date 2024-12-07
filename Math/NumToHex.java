package Math;

public class NumToHex {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int x = num & 15;
            if (x < 10) {
                sb.append(x);
            } else {
                sb.append((char) (x - 10 + 'a'));
            }
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        NumToHex converter = new NumToHex();
        System.out.println(converter.toHex(26));        // 1a
        System.out.println(converter.toHex(-1));       // ffffffff
        System.out.println(converter.toHex(0));        // 0
        System.out.println(converter.toHex(255));      // ff
        System.out.println(converter.toHex(-2147483648)); // 80000000
    }
}
