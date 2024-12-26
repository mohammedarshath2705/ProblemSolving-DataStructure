package Arrays;

public class CloseNum {
    public static int findClosest(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return -1;

        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) return arr[mid];
            else if (arr[mid] < k) left = mid + 1;
            else right = mid;
        }

        int closest = arr[left];
        if (left > 0) {
            int prev = arr[left - 1];
            if (Math.abs(prev - k) < Math.abs(closest - k) ||
                    (Math.abs(prev - k) == Math.abs(closest - k) && prev > closest)) {
                closest = prev;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 7};
        int k1 = 4;
        System.out.println(findClosest(arr1, k1));

        int[] arr2 = {1, 2, 3, 5, 6, 8, 9};
        int k2 = 4;
        System.out.println(findClosest(arr2, k2));

        int[] arr3 = {6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19};
        int k3 = 10;
        System.out.println(findClosest(arr3, k3));
    }
}
