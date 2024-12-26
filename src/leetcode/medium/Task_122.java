package leetcode.medium;

public class Task_122 {

    public int calculate() {
        int[] prices = new int[]{7,1,5,3,6,4};

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }

}
