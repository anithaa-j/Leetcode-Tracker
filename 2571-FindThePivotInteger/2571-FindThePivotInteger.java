// Last updated: 7/9/2026, 3:06:42 PM
class Solution {
    public int pivotInteger(int n) {
        for(int x=1; x<=n; x++){
            int ls = 0;
            for(int i = 1; i<=x; i++){
                ls+=i;
            }
            int rs =0;
            for(int j=x; j<=n; j++){
                rs+=j;
            }
            if(ls==rs) return x;
        }
        return -1;
    }
}