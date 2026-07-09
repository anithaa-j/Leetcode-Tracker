// Last updated: 7/9/2026, 3:11:25 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i =1, j = num ;
        while(i<=j){
            long mid = (i+j)/2;
            long square = mid*mid;
            if(square == num) return true;
            else if(square < num) i=mid+1;
            else j = mid-1;
            
        }
        return false;
    }
}