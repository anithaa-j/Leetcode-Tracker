// Last updated: 7/9/2026, 3:10:15 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1;
        while(n!=0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return pro-sum;
    }
}