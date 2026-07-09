// Last updated: 7/9/2026, 3:12:33 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxp =0;
        int min = prices[0];
        for(int i =1; i<prices.length; i++){
            int sell = prices[i];
            if(sell > min){
                int pro = sell - min;
                if(pro>maxp) maxp = pro;
            }else{
                min = sell;
            }
        }
        return maxp;
    }
}