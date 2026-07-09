// Last updated: 7/9/2026, 3:11:42 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
       if((n&(n-1))==0){
        return true;
       }else{
        return false;
       }
    }
}