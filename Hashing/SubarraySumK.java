package Hashing;

import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1,4,2,3,4,5,6,99};
        int k = 5;

        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            if (prefixMap.containsKey(sum - k))
                count += prefixMap.get(sum - k);
            prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count of subarrays = " + count);
    }
}
