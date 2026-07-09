// Last updated: 7/9/2026, 3:13:57 PM
class Solution {
    public int reverse(int x) {
        long s=0;
        while(x!=0){
            s*=10;
            s+=x%10;
            x=x/10;
        }
        if(s>Integer.MAX_VALUE || s<Integer.MIN_VALUE) return 0;
        return (int)s;
    }
}