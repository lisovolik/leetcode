package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public int calculate() {
        Map<Character, Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        String input = "MCMXCIV";
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int value = map.getOrDefault(input.charAt(i), 0);
            if (i != input.length() - 1){
                int nextVal = map.getOrDefault(input.charAt(i + 1), 0);
                if (nextVal > value) {
                    result = result - value;
                } else {
                    result = result + value;
                }
            } else {
                result = result + value;
            }
        }
        return result;
    }
}
