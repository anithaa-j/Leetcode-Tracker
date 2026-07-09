// Last updated: 7/9/2026, 3:05:59 PM
class Solution {
    public int maxFreqSum(String s) {
        Map <Character,Integer> vow_map = new HashMap<>();
        Map <Character,Integer> con_map = new HashMap<>();
        String vowels = "aeiouAEIOU";
        for(int i = 0; i< s.length(); i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                vow_map.put(s.charAt(i), vow_map.getOrDefault(s.charAt(i), 0) + 1);
            }
            else{
                con_map.put(s.charAt(i), con_map.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int vow = !vow_map.isEmpty() ? Collections.max(vow_map.values()) : 0;

        int con = !con_map.isEmpty() ? Collections.max(con_map.values()) : 0;

        return vow + con;
    }
}