package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates_26 {

    public int calculate() {
        int[] nums = new int[]{1,1,2};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Arrays.fill(nums, -1);
        int i = 0;
        for (Integer one: set){
            nums[i] = one;
            i++;
        }
        return set.size();
    }
}
