package leetcode.easy;

public class Task_191 {

    public int calculate() {
        int n = 2147483645;
        String s = Integer.toString(n, 2);

        int result = 0;
        for (char one: s.toCharArray()){
            if (one == '1') result++;
        }
        return result;
    }
}
