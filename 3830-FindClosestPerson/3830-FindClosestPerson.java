// Last updated: 7/9/2026, 3:05:54 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        if (a<b) return 1;
        else if(a>b) return 2;
        else return 0;
    }
}