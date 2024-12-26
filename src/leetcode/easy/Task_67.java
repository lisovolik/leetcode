package leetcode.easy;

public class Task_67 {

    public String calculate() {
        String a = "1010";
        String b = "1011";
        String big = "";
        String low = "";
        if (a.length() >= b.length()) {
            big = a;
            low = b;
        } else {
            big = b;
            low = a;
        }
        String rev_low = new StringBuilder(low).reverse().toString();
        String rev_big = new StringBuilder(big).reverse().toString();

        StringBuilder builder = new StringBuilder();
        char val = '0';
        for (int i = 0; i < rev_big.length(); i++){
            char digit = rev_big.charAt(i);
            char digit2 = getDigit(i, rev_low);
            String res = findResult(digit, digit2, val);
            val = res.charAt(0);
            builder.append(res.charAt(1));
        }
        if (val == '1'){
            builder.append(val);
        }
        return builder.reverse().toString();
    }

    private String findResult(char digit, char digit2, char val) {
        if (digit == '1' && digit2 == '1') {
            if (val == '1') {
                return "11";
            } else {
                return "10";
            }
        } else if (digit == '0' && digit2 =='0'){
            if (val == '1') {
                return "01";
            } else {
                return "00";
            }
        } else {
            if (val == '1') {
                return "10";
            } else {
                return "01";
            }
        }
    }

    private char getDigit(int index, String s) {
        if (s.length() > index) {
            return s.charAt(index);
        } else {
            return '0';
        }
    }
}
