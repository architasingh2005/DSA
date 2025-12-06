import java.util.*;

class Solution {
    int n;
    List<List<Integer>> result;

   /* void solve(List<Integer> temp, boolean[] used, int[] nums) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i]) continue; // skip if already used

            temp.add(nums[i]);
            used[i] = true;

            solve(temp, used, nums);

            // backtrack
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        result = new ArrayList<>();
        boolean[] used = new boolean[n];
        solve(new ArrayList<>(), used, nums);
        return result;*/

        // using set
        void solve(List<Integer> temp, Set<Integer> used, int[] nums) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used.contains(nums[i])) continue; // skip if already used

            temp.add(nums[i]);
            used.add(nums[i]);

            solve(temp, used, nums);

            // backtrack
            temp.remove(temp.size() - 1);
            used.remove(nums[i]);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        result = new ArrayList<>();
        solve(new ArrayList<>(), new HashSet<>(), nums);
        return result;
    }
}

