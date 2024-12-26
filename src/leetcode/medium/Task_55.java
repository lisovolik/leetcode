package leetcode.medium;

public class Task_55 {

    public boolean calculate() {
        int[] nums = new int[]{2,3,1,1,4};
        return canJump(nums);
    }

    private boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
