package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Task_169 {

    public int calculate() {
        int[] nums = new int[]{3,2,3};
        int times = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val + 1);
        }

        int result = Integer.MIN_VALUE;
        for (Integer val: map.keySet()){
            int count = map.getOrDefault(val, 0);
            if (count > times){
                result = val;
                break;
            }
        }
        return result;
    }
}
