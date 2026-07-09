// Last updated: 7/9/2026, 3:11:58 PM
class Solution {
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0){
            int lastbit = n&1;
            if(lastbit == 1){
                count++;
            }
            n=n>>1;
        }
         return count;
    }
}