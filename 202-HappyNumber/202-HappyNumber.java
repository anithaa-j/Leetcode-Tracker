// Last updated: 7/9/2026, 3:11:50 PM
class Solution {
    public static int sumOfSquares(int n){
        int l=0, s=0;
        while(n>0){
            s=(n%10);
            l+=s*s;
            n/=10;
        }
        return l;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        }while(slow!=fast);
        return slow==1?true:false;
    }
}