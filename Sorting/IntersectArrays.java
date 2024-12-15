package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class IntersectArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] s = new boolean[1001];
        for (int x : nums1) {
            s[x] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : nums2) {
            if (s[x]) {
                ans.add(x);
                s[x] = false;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        IntersectArrays obj = new IntersectArrays();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(obj.intersection(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(obj.intersection(nums3, nums4)));

        int[] nums5 = {1, 2, 3, 4, 5};
        int[] nums6 = {6, 7, 8, 9};
        System.out.println(Arrays.toString(obj.intersection(nums5, nums6)));

        int[] nums7 = {100, 200, 300};
        int[] nums8 = {300, 400, 500};
        System.out.println(Arrays.toString(obj.intersection(nums7, nums8)));
    }
}
