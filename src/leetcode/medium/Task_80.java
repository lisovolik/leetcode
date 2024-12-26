package leetcode.medium;

public class Task_80 {

    public int calculate() {
        int[] nums = new int[]{1,1,1,2,2,3};

        int prev_prev = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        int current = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            prev_prev = prev;
            prev = current;
            current = nums[i];
            if (prev_prev != current) {
                nums[index] = current;
                index++;
            }
        }
        return index;
    }

}
