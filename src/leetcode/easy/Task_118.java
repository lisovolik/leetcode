package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_118 {

    public List<List<Integer>> calculate() {
        int numRows = 5;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> item = new ArrayList<>(i + 1);
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    item.add(k, 1);
                } else {
                    item.add(k, result.get(i-1).get(k-1) + result.get(i-1).get(k));
                }
            }
            result.add(item);
        }
        return result;
    }
}
