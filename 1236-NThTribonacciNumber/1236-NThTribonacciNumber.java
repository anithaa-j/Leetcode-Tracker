// Last updated: 7/9/2026, 3:10:30 PM
class Solution {
    public int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int a=0, b=1, c=1, t=0;
        for(int i=1;i<=n-2;i++){
            t=a+b+c;
            a=b;
            b=c;
            c=t;
        }
        return t;
    }
}