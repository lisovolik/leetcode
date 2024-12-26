package leetcode.easy;

public class FinalPrice_1475 {

    public int[] calculate() {
        int[] prices = new int[]{8,4,6,2,3};
        int [] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    price = prices[i] - prices[j];
                    break;
                }
            }
            result[i] = price;
        }
        return result;
    }
}
