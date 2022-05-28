import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Pattern;

class Result {

    public static void plusMinus(List<Integer> arr) {
        float pluses = 0;
        float minuses = 0;
        float zeros = 0;
        int arrLength = arr.size();

        for (int number : arr) {
            if (number > 0) {
                pluses++;
            } else if (number < 0) {
                minuses++;
            } else {
                zeros++;
            }
        }
        System.out.printf("%.6f %n", pluses / arrLength);
        System.out.printf("%.6f %n", minuses / arrLength);
        System.out.printf("%.6f %n", zeros / arrLength);



    }

}


public class Main {

    public static void main(String[] args) {


        List<Integer> testInput = new ArrayList<Integer>();
        testInput.add(-4);
        testInput.add(3);
        testInput.add(-9);
        testInput.add(0);
        testInput.add(4);
        testInput.add(1);

        System.out.println(testInput);


        Result.plusMinus(testInput);


    }
}