package ExceptionHandling;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds!");
        }
    }
}
