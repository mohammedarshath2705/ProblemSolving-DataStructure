package Arrays;

import java.util.List;
import java.util.ArrayList;

public class TriangleNo {

    // Function to find the minimum path sum from top to bottom
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Create a DP array, f, to store the minimum path sum at each level
        int[] f = new int[n + 1];
        
        // Start from the last row of the triangle and move upwards
        for (int i = n - 1; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                f[j] = Math.min(f[j], f[j + 1]) + triangle.get(i).get(j);
            }
        }
        
        // The minimum path sum will be stored at f[0]
        return f[0];
    }

    // Driver code to test the function with multiple test cases
    public static void main(String[] args) {
        TriangleNo solver = new TriangleNo();

        // Test Case 1
        List<List<Integer>> triangle1 = new ArrayList<>();
        triangle1.add(List.of(2));
        triangle1.add(List.of(3, 4));
        triangle1.add(List.of(6, 5, 7));
        triangle1.add(List.of(4, 1, 8, 3));
        
        System.out.println("Minimum Path Sum for Triangle 1: " + solver.minimumTotal(triangle1));
        
        // Test Case 2
        List<List<Integer>> triangle2 = new ArrayList<>();
        triangle2.add(List.of(1));
        triangle2.add(List.of(2, 3));
        triangle2.add(List.of(4, 5, 6));
        triangle2.add(List.of(7, 8, 9, 10));
        
        System.out.println("Minimum Path Sum for Triangle 2: " + solver.minimumTotal(triangle2));

        // Test Case 3 (Smaller Triangle)
        List<List<Integer>> triangle3 = new ArrayList<>();
        triangle3.add(List.of(1));
        triangle3.add(List.of(2, 3));

        System.out.println("Minimum Path Sum for Triangle 3: " + solver.minimumTotal(triangle3));

        // Test Case 4 (Larger Triangle)
        List<List<Integer>> triangle4 = new ArrayList<>();
        triangle4.add(List.of(5));
        triangle4.add(List.of(6, 2));
        triangle4.add(List.of(3, 9, 1));
        triangle4.add(List.of(4, 3, 2, 7));

        System.out.println("Minimum Path Sum for Triangle 4: " + solver.minimumTotal(triangle4));
    }
}
