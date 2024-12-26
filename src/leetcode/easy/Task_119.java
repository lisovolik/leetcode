package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Task_119 {

    public List<Integer> calculate() {
        int numRows = 5;

        return findRow(new ArrayList<>(), 5);
    }

    private List<Integer> findRow(List<Integer> prev, int row) {
        if (row == prev.size()) return prev;
        List<Integer> item = new ArrayList<>();
        for (int i = 0; i <= prev.size(); i++) {
            if (i == 0 || i == prev.size()) {
                item.add(1);
            } else {
                item.add(prev.get(i-1) + prev.get(i));
            }
        }
        return findRow(item, row);
    }
}
