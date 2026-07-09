// Last updated: 7/9/2026, 3:06:06 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int og=x;
        int l, sum=0;
        while(x!=0){
            l = x%10;
            sum=sum+l;
            x=x/10;
        }
        if(og % sum==0){
            return sum;
        } 
        else return -1;
    }
}