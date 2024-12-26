package leetcode.easy;

public class Task_35 {

    public int calculate() {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;

        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i] || target == nums[i]) {
                index = i;
                break;
            }
        }
        if (index < 0) index = nums.length;
        return index;
    }
}
