package Arrays;
/*
Frequency of Elements - Return frequency map of elements (or mode).
 */
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    public static Map<Integer,Integer> frequencyMap(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int x : arr){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }

        return freq;
    }

    public static int findMode(int[] arr){
        Map<Integer,Integer> freq = frequencyMap(arr);

        int mode = arr[0];
        int maxCount = 0;

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 1, 4, 2};
        int[] arr2 = {5, 5, 5, 7, 7, 8};

        System.out.println("Frequency map of arr1: " + frequencyMap(arr1));
        System.out.println("Mode of arr1: " + findMode(arr1));

        System.out.println("Frequency map of arr2: " + frequencyMap(arr2));
        System.out.println("Mode of arr2: " + findMode(arr2));
    }
}
