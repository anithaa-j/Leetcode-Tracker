// Last updated: 7/9/2026, 3:14:08 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans =0;
        for(int i = 0; i<n; i++){
            int freq[]= new int[256];
            for(int j=i;j<n;j++){
                if(freq[s.charAt(j)]>0) break;
                else {
                    freq[s.charAt(j)]++;
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}