package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Parentheses_20 {

    public boolean calculate() {
        String s = "()))";
        char first = s.charAt(0);
        if (first == ')' || first == '}' || first == ']' || s.length() % 2 != 0){
            return false;
        }
        List<Character> history = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char one = s.charAt(i);
            if (one == '(' || one == '{' || one == '[') {
                history.add(one);
            } else if (one == ')') {
                if (!failedDelete(history,'(')) return false;

            } else if (one == '}') {
                if (!failedDelete(history, '{')) return false;

            }  else if (one == ']') {
                if (!failedDelete(history, '[')) return false;
            }
        }

        return history.stream().noneMatch(i -> i == '(' || i == ')' || i == '{' || i == '}' || i == '[' || i == ']');
    }

    private boolean failedDelete(List<Character> history, char c) {
        boolean result = false;
        for (int i = history.size() - 1; i >= 0; i--) {
            if (history.get(i) != ' ') {
                if (history.get(i) == c) {
                    result = true;
                    history.set(i, ' ');
                    break;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
