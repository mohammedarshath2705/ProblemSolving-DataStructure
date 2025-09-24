package Arrays;
/*
Count Pairs with Given Sum Given array and value S, count distinct pairs (i,j) with arr[i]+arr[j]=s.
0(n) - time complexity
 */
import java.util.HashMap;
import java.util.Map;

public class CountPairsGivenSum {
    public static int countPairs(int[] arr,int S){
        Map<Integer,Integer> freq= new HashMap<>();

        int count = 0;

        for(int x : arr){
            int comp = S-x;

            if(freq.containsKey(comp)){
                count+=freq.get(comp);
            }

            freq.put(x,freq.getOrDefault(x,0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, -1, 5};
        int S1 = 6;
        System.out.println("Test 1 → " + countPairs(arr1, S1));

        int[] arr2 = {1, 1, 1, 1};
        int S2 = 2;
        System.out.println("Test 2 → " + countPairs(arr2, S2));


        int[] arr3 = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int S3 = 11;
        System.out.println("Test 3 → " + countPairs(arr3, S3));

        int[] arr4 = {2, 8, 7, 10, -2, 5, 0, 6};
        int S4 = 8;
        System.out.println("Test 4 → " + countPairs(arr4, S4));

        int[] arr5 = {3, 3, 3, 3};
        int S5 = 6;
        System.out.println("Test 5 → " + countPairs(arr5, S5));
    }
}
