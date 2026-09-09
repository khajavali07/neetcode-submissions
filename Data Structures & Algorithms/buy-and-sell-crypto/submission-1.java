class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length ==1){
            return 0;
        }
        int min = prices[0], max = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max = max>prices[i]-min?max:prices[i]-min;
        }
        return max;

    }
}
