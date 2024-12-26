package leetcode.easy;

public class Task_66 {

    public int[] calculate() {
        int[] digits = new int[]{9,9,9,9,9,9};

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
                if (i == 0) {
                    return createNewArray(digits);
                }
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }

    private int[] createNewArray(int[] digits) {
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            array[i+1] = digits[i];
        }
        return array;
    }

}
