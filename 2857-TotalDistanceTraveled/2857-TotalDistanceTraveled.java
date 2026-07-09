// Last updated: 7/9/2026, 3:06:13 PM
class Solution {
    public int distanceTraveled(int mt, int at) {
        int t=0;
        while(mt>=5){
            t+=50;
            mt-=5;
            if(at>=1){
            mt++;
            at--;
            }
        }
        return t+(mt*10);   
    }
}