package ExceptionHandling;

public class NestTry {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            try {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: index issue");
            }

            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: division by zero");
        }
    }
}
