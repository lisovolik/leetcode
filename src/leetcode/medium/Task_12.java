package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Task_12 {

    public String calculate() {
        //int num = 58;//LVIII
        //int num = 20;//XX
        //int num = 1994;//MCMXCIV
        //int num = 3749;//MMMDCCXLIX
        int num = 6;//VI
        List<String> res = new ArrayList<>();
        String result = "";
        List<Integer> list = List.of(1000, 100, 10, 1);

        for (Integer one: list) {
            int ost = num / one;
            if (ost > 0) {
                String temp = convert(one, ost);
                res.add(temp);
                num = num % one;
            }
        }

        for (String one: res){
            result = result + one;
        }

        return result;
        //MCMXCIV
    }

    private String convert(int position, int num) {
        int number = position * num;
        int[] nums = new int[]{1,5,10,50,100,500,1000};
        String[] values = new String[]{"I","V","X","L","C","D","M"};

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == number) {
                return values[i];
            }
        }

        String val = "";
        if (num == 4 || num == 9) {
            for (int i = 0; i < nums.length; i++) {
                if (number < nums[i]) {
                    val = getValueFor(position, nums, values) + values[i];
                    break;
                }
            }
        } else {
            int diff = 0;
            for (int i = 0; i < nums.length; i++) {
                if (number < nums[i]) {
                    val = values[i-1];
                    diff = (number - nums[i-1])/position;
                    String temp = getValueFor(position, nums, values);
                    val = val + getResultTimes(diff, temp);
                    break;
                }
            }
            if (val.isEmpty()) {
                String temp = getValueFor(position, nums, values);
                val = getResultTimes(num, temp);
            }
        }

        return val;
    }

    private String getValueFor(int digit, int[] nums, String[] values) {
        String result = "";
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == digit) {
                result = values[i];
                break;
            }
        }
        return result;
    }

    private String getResultTimes(int count, String val) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + val;
        }
        return result;
    }
}
