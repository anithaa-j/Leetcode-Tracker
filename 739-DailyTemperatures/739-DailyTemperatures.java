// Last updated: 7/9/2026, 3:10:48 PM
class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        /// UPVOTE !
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}