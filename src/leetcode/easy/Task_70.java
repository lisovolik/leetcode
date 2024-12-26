package leetcode.easy;

public class Task_70 {

    public int calculate() {
        int x = 4;
        if (x == 0) return 0;
        if (x == 1) return 1;
        int n0 = 1;
        int n1 = 1;
        int n2 = n0 + n1;
        for(int i = 2; i <= x; i++){
            n2 = n0 + n1;
            n0=n1;
            n1=n2;
        }
        return n2;
    }

    //0,1,1,2,3,5,8,13

}
