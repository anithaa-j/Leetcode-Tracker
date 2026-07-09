// Last updated: 7/9/2026, 3:10:20 PM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2) return true;
        int x1,y1,x2,y2;
        x1=coordinates[0][0];
        y1=coordinates[0][1];
        x2=coordinates[1][0];
        y2=coordinates[1][1];
        for(int i=2;i<coordinates.length;i++){
            if (((coordinates[i][1]-y1)*(x2-x1))!=((y2-y1)*(coordinates[i][0]-x1))){
                return false;
            }
        }
        return true;
    }
}