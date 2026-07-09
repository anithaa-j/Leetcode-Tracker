// Last updated: 7/9/2026, 3:13:44 PM
class Solution {
    public int romanToInt(String s) {
       int n = s.length();
       int ans = convert(s.charAt(n-1));
       for(int i=n-2;i>=0;i--){
            int a = convert(s.charAt(i)) ;
            int b = convert(s.charAt(i + 1));
            if(a<b) ans = ans -a;
            else ans = ans +a;
       }
       return ans;
    }
    public int convert(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}