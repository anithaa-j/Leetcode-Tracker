// Last updated: 7/9/2026, 3:06:10 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 -Math.round((((purchaseAmount+5)/10)*10));
    }
}