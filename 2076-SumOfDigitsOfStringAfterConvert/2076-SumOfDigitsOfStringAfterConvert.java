// Last updated: 7/9/2026, 3:09:49 PM
class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;

        for (char ch : s.toCharArray()) {
            int value = ch - 'a' + 1;  
            while (value > 0) {
                sum += value % 10;  
                value /= 10;
            }
        }
        int n = sum;
        for (int i = 1; i < k; i++) {
            int newSum = 0;
            while (n > 0) {
                newSum += n % 10; 
                n /= 10;           
            }
            n = newSum;  
        }return n;
    }
}