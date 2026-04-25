class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int min = 0;
        for(int i = 0; i<prices.length-1; i++){
            if(prices[i+1] > prices[i]){
                min = prices[i+1] - prices[i];
                sum += min;
            }else{
                min = 0;
            }
        }
        return sum;
    }
}