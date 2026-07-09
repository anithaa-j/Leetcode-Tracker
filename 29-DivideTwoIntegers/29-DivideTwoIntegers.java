// Last updated: 7/9/2026, 3:13:18 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int num = dividend/divisor;
        int trunate = (int) num;
        return trunate;
    }
}