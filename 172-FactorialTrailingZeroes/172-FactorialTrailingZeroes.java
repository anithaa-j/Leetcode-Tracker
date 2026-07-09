// Last updated: 7/9/2026, 3:12:16 PM
class Solution {
    public int trailingZeroes(int n) {
       int c =0;
       while(n!=0){
        n = n/5;
        c+=n;
       }
       return c;
    }
}