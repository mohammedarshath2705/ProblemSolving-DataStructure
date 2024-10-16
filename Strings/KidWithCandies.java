package Strings;
/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.*/
import java.util.ArrayList;
import java.util.List;

public class KidWithCandies {
    public static void main(String[] args) {
        // Create an instance of the KidWithCandies class
        KidWithCandies solution = new KidWithCandies();

        // Test case: array of candies and extraCandies
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        // Call the kidsWithCandies method
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        // Print the result
        System.out.println("Result: " + result);
    }

    // Method to solve the problem
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        int c = candies.length;

        // Find the maximum number of candies a child has
        for (int i = 1; i < c; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }

        // List to store the results
        List<Boolean> result = new ArrayList<>();

        // Check for each child if they can have the greatest number of candies
        for (int i = 0; i < c; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }

        return result;
    }
}

