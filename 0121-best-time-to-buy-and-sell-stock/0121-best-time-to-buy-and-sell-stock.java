class Solution {
    public int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int price : prices){
            min_value = Math.min(min_value, price);
            maxProfit = Math.max(maxProfit,price-min_value);
            }
        return maxProfit;
    }
}