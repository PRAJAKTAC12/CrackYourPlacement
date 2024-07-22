class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minimal = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<n;i++){
            if(prices[i]<minimal){
                minimal = prices[i];
            }else if(prices[i]-minimal>maxprofit){
                maxprofit = prices[i]-minimal;
            }
        }
        return maxprofit;
    }
}
