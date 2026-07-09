// Last updated: 7/9/2026, 3:09:54 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans =0;
        for(int i =0;i<boxTypes.length;i++){
            int num = boxTypes[i][0];
            int q = boxTypes[i][1];
            int bt = Math.min(num,truckSize);
            truckSize = truckSize-bt;
            ans += bt * q;
        }
        return ans;
    }
}