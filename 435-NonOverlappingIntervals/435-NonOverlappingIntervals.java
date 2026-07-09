// Last updated: 7/9/2026, 3:11:20 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int n = intervals.length;
        int c = 0;
        int end = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<end) c = c+1;
            else end = intervals[i][1];
        }
        return c;
    }
}