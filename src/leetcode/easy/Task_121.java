package leetcode.easy;

public class Task_121 {

    public int calculate() {
        int[] prices = new int[]{7,6,4,3,1};
        int min = prices[0];
        int max = prices[0];
        int profit = 0;

        for (int i =0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = min;
            }
            if (prices[i] > max) {
                max = prices[i];
            }
            int value = max - min;
            if (profit < value) {
                profit = value;
            }
        }
        return profit;
    }
}
