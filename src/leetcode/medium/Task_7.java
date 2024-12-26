package leetcode.medium;

public class Task_7 {

    public int calculate() {
        int x = 1534236469;// 9646324351;
        String s = String.valueOf(x);
        StringBuilder builder = new StringBuilder();
        int last = 0;
        if (s.charAt(0) == '-') {
            last = 1;
            builder.append(s.charAt(0));
        }
        for (int i = s.length() - 1; i >= last; i--) {
            builder.append(s.charAt(i));
        }
        try {
            return Integer.valueOf(builder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
