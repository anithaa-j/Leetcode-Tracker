// Last updated: 7/9/2026, 3:09:59 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        int n = mat.length;
        int i=0,j=0;
        for(int k=1;k<=n;k++){
            s+=mat[i][j];
            i++;j++;
        }
        i=0;j=n-1;
        for(int k=1;k<=n;k++){
            if(i!=j) s+=mat[i][j];
            i++;j--;
        }
    return s;
    }
}