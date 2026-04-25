class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i = 0; i<prices.length-1; i++){
            
            if(prices[i] < min){
                min = prices[i];
                max = prices[i+1];
                total = total < max - min ? max - min: total;
            }else{
                if(prices[i+1] >= max){
                    max = prices[i+1];
                    total = total < max - min ? max - min: total;
                }
            }
            

        }
        return total;
    }
}
