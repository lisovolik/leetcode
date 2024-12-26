import leetcode.medium.Task_122;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //int[] result = new leetcode.easy.FinalPrice_1475().calculate();
        //String[] result = new leetcode.easy.SortPeople_2418().calculate();
        //boolean result = new leetcode.easy.PalindromeNumber_9().calculate();
        //int result = new leetcode.easy.RomanToInteger_13().calculate();
        //boolean result = new leetcode.easy.Parentheses_20().calculate();
        //int result = new leetcode.easy.RemoveDuplicates_26().calculate();
        //int result = new leetcode.easy.RemoveElement_27().calculate();
        //int result = new leetcode.easy.Task_28().calculate();
        //int result = new Task_35().calculate();
        //int result = new Task_58().calculate();
        //int[] result = new Task_66().calculate();
        //String result = new Task_67().calculate();
        //int result = new Task_69().calculate();
        //int result = new Task_70().calculate();
        //Task_83.ListNode result = new Task_83().calculate();
        //List<List<Integer>> result = new Task_118().calculate();
        //List<Integer> result = new Task_119().calculate();
        //int result = new Task_121().calculate();
        //boolean result = new Task_125().calculate();
        //int result = new Task_191().calculate();
        //int result = new Task_Medium_7().calculate();
        //int result = new Task_Medium_11().calculate();
        //String result = new Task_Medium_12().calculate();
        //int result= new Task_Medium_80().calculate();
        //int result= new Task_169().calculate();
        //new Task_Medium_189().calculate();
        //int result = new Task_Medium_122().calculate();
        //boolean result = new Task_Medium_55().calculate();
        int result = new Task_122().calculate();
        System.out.println(result);
    }


    public static String printArray(int[] array) {
        return  IntStream.of(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
    }

    public static String printArray(String[] array) {
        return String.join(",", array);
    }
}