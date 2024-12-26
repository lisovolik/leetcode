package leetcode.easy;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPeople_2418 {

    public String[] calculate() {
        String[]  names = new String[] {"Mary","John","Emma"};
        int[] heights = new int[]{180,165,170};
        ArrayList<Item> list = new ArrayList<>(heights.length);
        for (int i = 0; i < heights.length; i++) {
            list.add(new Item(names[i], heights[i]));
        }
        List<String> rr = list.stream().sorted().map(item -> item.name).toList();
        return list.stream().sorted().map(Item::name).toArray(String[]::new);

    }

    public record Item(String name, int height) implements Comparable<Item> {
        @Override
        public int compareTo(Item other) {
            return Integer.compare(other.height, this.height);
        }
    }
}
