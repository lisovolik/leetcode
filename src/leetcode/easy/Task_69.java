package leetcode.easy;

public class Task_69 {

    public int calculate() {
        int x = 2147483647;

        int init = x;
        if (init > 46340) init = 46340;
        int min = getMinLimit(init, x);
        int max = getMaxLimit(min, x);
        return max;
    }

    private int getMinLimit (int number, int x) {
        int res = number;
        while (res * res > x){
            res = res / 2;
        }
        return res;
    }

    private int getMaxLimit (int min, int x) {
        int res = min;
        if (res * res == x) return res;
        int prev = res;
        while (res <= 46340 && res * res <= x){
            res++;
            prev = res;
        }
        return prev - 1;
    }
}
