// Last updated: 7/9/2026, 3:10:23 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int count =0,c=0;
        for(int i:position){
            if(i%2==0) count++;
            else c++;
        }
        return Math.min(count,c);

    }
}