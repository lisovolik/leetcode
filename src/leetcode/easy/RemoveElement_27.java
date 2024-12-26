package leetcode.easy;

public class RemoveElement_27 {

    public int calculate() {
        int[] nums = new int[]{1,1,2};
        int val = 2;
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result[count] = nums[i];
                count++;
            }
        }
        for (int i = 0; i <= count; i++) {
            nums[i] = result[i];
        }
        return count;
    }
}
