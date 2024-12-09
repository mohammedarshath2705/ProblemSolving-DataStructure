package Math;

public class FibnocNum {
    public int fib(int n) {
        int a = 0, b = 1;
        while (n-- > 0) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        FibnocNum fibonacci = new FibnocNum();
        System.out.println("Fib(0): " + fibonacci.fib(0));
        System.out.println("Fib(1): " + fibonacci.fib(1));
        System.out.println("Fib(2): " + fibonacci.fib(2));
        System.out.println("Fib(5): " + fibonacci.fib(5));
        System.out.println("Fib(10): " + fibonacci.fib(10));
    }
}
