package leetcode.easy;

public class PalindromeNumber_9 {
    public boolean calculate() {
        int number = 10001;
        String s = String.valueOf(number);
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - i - 1) break;
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
