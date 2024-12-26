package leetcode.medium;

public class Task_189 {

    public void calculate() {
        int[] nums = new int[]{-1,-100,3,99};
        int k = 2;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int newIndex = (i + k) % nums.length;
            res[newIndex] = nums[i];
        }
        for (int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
    }
}
