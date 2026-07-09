// Last updated: 7/9/2026, 3:13:48 PM
class Solution {
    public int maxArea(int[] height) {
      int i = 0, j = height.length-1;
      int ans =0;
      while(i<j){
        int h = Math.min(height[i],height[j]);
        int w = j-i;
        int area = h*w;
        if (area>ans){
            ans = area;
        }
        if(height[i]<height[j]) i++;
        else j--;
      }
      return ans;
    }
}