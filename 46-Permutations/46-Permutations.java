// Last updated: 7/9/2026, 3:13:07 PM
import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }
    private void backtrack(int[] nums, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            backtrack(nums, i + 1, result);
            swap(nums, i, j); 
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
