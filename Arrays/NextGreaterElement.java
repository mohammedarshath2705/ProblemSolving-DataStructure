package Arrays;
/*
Next Greater Element For each array element, print the next greater element to its right or -1 if none.
 */
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreatElement(int[] arr){
        int n=arr.length;
        int [] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--) {
            while (!stack.empty() && stack.peek() <=arr[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);

        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr= {4,5,2,25};

        int [] res = nextGreatElement(arr);

        System.out.println("Next Greater Elements = " + Arrays.toString(res));
    }
}
