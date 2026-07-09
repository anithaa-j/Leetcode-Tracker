// Last updated: 7/9/2026, 3:11:17 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int count =0;
        int n=x^y;
        while(n!=0){
            if((n&1) == 1) count++;
            n=n>>1;
        }
        return count;
    }
}