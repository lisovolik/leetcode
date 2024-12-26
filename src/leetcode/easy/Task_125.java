package leetcode.easy;

public class Task_125 {

    public boolean calculate() {
        String s = "0P";

        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(result).reverse().toString();
        if (result.length() == 1) return false;
        else if (result.isEmpty()) return true;
        else return result.equals(reverse);
    }
}
