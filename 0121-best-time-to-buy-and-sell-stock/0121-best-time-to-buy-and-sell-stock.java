class Solution {
    public int maxProfit(int[] prices) {

        // prices = [7,1,5,3,6,4]
        //  traverse in an array
        // compare minValue
        //  find minValue = 1
        // else 5i - minValue(1) = 5-1 = 4
        //  maxProfit = 4

        int maxSell = 0;
        int minBuy = Integer.MAX_VALUE;
        int profit = 0;
       

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i]; // 7  1
            }else{
                profit = prices[i] - minBuy;  //5-1= 4, 3-1=2
                if(profit > maxSell  ){
                    maxSell = profit; //4
                }
            }
            
        }
        return maxSell;
    }
        
}