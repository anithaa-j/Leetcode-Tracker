// Last updated: 7/9/2026, 3:13:04 PM
class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];

        backtrack(nums, visited, new ArrayList<>());

        return result;
    }

    private void backtrack(int[] nums, boolean[] visited, List<Integer> current) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i])
                continue;

            // Skip duplicate numbers
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
                continue;

            visited[i] = true;
            current.add(nums[i]);

            backtrack(nums, visited, current);

            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}