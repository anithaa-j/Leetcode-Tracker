// Last updated: 7/9/2026, 3:13:52 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int s=0;
        int og = x;
        while(x!=0){
            s*=10;
            s+=x%10;
            x=x/10;
        }
        if(og==s) return true;
        else return false;
    }
}