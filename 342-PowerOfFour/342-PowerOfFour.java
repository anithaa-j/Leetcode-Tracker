// Last updated: 7/9/2026, 3:11:27 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return n>0 && (n & (n-1))==0 && (n & 0x55555555)!=0;
    }
}