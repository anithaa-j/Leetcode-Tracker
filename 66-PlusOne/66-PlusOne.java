// Last updated: 7/9/2026, 3:12:51 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }   
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}