class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int currentprofit =0;
        int totalprofit =0;

        for(int j=i+1;j<prices.length;j++){
            if(prices[j]<prices[i]){
                i=j;
            }
            else {
                currentprofit = prices[j]-prices[i];
                if(currentprofit>totalprofit){
                    totalprofit = currentprofit;
                }

            }
        }
        return totalprofit;
        
    }
}