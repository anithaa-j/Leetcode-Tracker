// Last updated: 7/9/2026, 3:10:39 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a=0, b=1;
        for(int i=2; i<=n; i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        return b;
    }
}