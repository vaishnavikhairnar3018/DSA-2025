
public class BuyAndSellStocks {
    
    public static int buyAndsell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {
               int profit = prices[i] - buyPrice; //todays's profit = selling price - buying price
               maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; //update the buying price 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndsell(prices)); //O(n)
    }
}
