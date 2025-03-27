package SlidingWindowPatterns;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int left = 0, right = 1, maxProfit = 0;
        // Approach - 1
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;

        }

        System.out.println(maxProfit);
        // Approach - 2
        int minPrice = Integer.MAX_VALUE;
        int maxP = 0;
        for(int price: prices){
            minPrice = Math.min(minPrice, price);
            maxP = Math.max(maxP, price - minPrice);
        }
        System.out.println(maxP);
    }
}
