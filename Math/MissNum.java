/*
Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.


 */

package Math;

import java.util.HashSet;
import java.util.Set;

public class MissNum {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MissNum missNum = new MissNum();
        System.out.println(missNum.missingNumber(new int[]{3, 0, 1})); // 2
        System.out.println(missNum.missingNumber(new int[]{0, 1}));    // 2
        System.out.println(missNum.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); // 8
        System.out.println(missNum.missingNumber(new int[]{0}));       // 1
        System.out.println(missNum.missingNumber(new int[]{1}));       // 0
    }
}
