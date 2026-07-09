// Last updated: 7/9/2026, 3:06:24 PM
class Solution {
    public int sumOfMultiples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0) count+=i;
        }
        return count;
    }
}