package leetcode.easy;

public class Task_58 {

    public int calculate() {
        String s = "   fly me   to   the moon  ";
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            } else if (result > 0){
                break;
            }
        }
        return result;
    }
}
