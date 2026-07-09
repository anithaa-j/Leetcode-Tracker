// Last updated: 7/9/2026, 3:12:56 PM
import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            fact *= i;
        }
        k--; 
        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            fact /= i;
            int index = k / fact;
            k %= fact;
            sb.append(nums.get(index));
            nums.remove(index);
        }
        return sb.toString();
    }
}