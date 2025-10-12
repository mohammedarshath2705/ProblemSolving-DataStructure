package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 100;
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("Some other error: " + e);
        }
    }
}
