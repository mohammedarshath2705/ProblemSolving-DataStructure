package Math;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor > 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor = xor >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        HammingDistance solution = new HammingDistance();

        System.out.println(solution.hammingDistance(1, 4));
        System.out.println(solution.hammingDistance(3, 1));
        System.out.println(solution.hammingDistance(0, 0));
        System.out.println(solution.hammingDistance(7, 10));
        System.out.println(solution.hammingDistance(15, 15));
    }
}
