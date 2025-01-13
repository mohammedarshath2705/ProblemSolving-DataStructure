package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {

    private List<List<Integer>> ans;
    private List<Integer> t;
    private boolean[] vis;
    private int[] nums;

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        t = new ArrayList<>();
        this.nums = nums;
        vis = new boolean[nums.length];
        dfs(0);
        return ans;
    }

    private void dfs(int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        for (int j = 0; j < nums.length; ++j) {
            if (!vis[j]) {
                vis[j] = true;
                t.add(nums[j]);
                dfs(i + 1);
                t.remove(t.size() - 1);
                vis[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        PermutationArray permutationArray = new PermutationArray();

        int[] test1 = {1, 2, 3};
        System.out.println("Permutations of {1, 2, 3}: " + permutationArray.permute(test1));

        int[] test2 = {4, 5};
        System.out.println("Permutations of {4, 5}: " + permutationArray.permute(test2));

        int[] test3 = {7};
        System.out.println("Permutations of {7}: " + permutationArray.permute(test3));

        int[] test4 = {};
        System.out.println("Permutations of {}: " + permutationArray.permute(test4));
    }
}
