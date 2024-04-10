package Array;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BuySellStocks {
    static int maxProfit(int prices[]){
       int buyPrice = Integer.MAX_VALUE;
       int maximumProfit =  0;

       for(int i=0; i<prices.length; i++){
           if(buyPrice < prices[i]){ // profit
               int profit = prices[i]-buyPrice; // todays's profit
               maximumProfit = Math.max(maximumProfit,profit);
           }else{
               buyPrice = prices[i];
           }
       }
       return maximumProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};//o(n)
        System.out.println(maxProfit(prices));
    }
}
