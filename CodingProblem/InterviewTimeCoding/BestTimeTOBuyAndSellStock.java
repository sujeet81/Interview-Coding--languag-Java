package CodingProblem.InterviewTimeCoding;

import java.util.Arrays;

public class BestTimeTOBuyAndSellStock {
    public static void main(String[] args) {

        int[] arr = {7,6,4,3,1};
        System.out.println(buyAndSellStock(arr));
    }

    static int buyAndSellStock(int[] prices){
        int minPrices = Integer.MAX_VALUE;
        int maxPrices = 0;
        for(int i = 0; i<prices.length;i++){
            if(prices[i] < minPrices){
                minPrices = prices[i];
            }
            else if(prices[i] - minPrices > maxPrices){
                maxPrices = prices[i] - minPrices;
            }
        }
        return maxPrices;
    }
}
