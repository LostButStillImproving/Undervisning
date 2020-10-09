package SixPointTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class SumDigits {
    public int sumDigits(long n){
        String digitsString = Long.toString(n);
        String[] digitsArray = digitsString.split("");
        List<Integer> list= new ArrayList<Integer>();

        for (int i = 0; i < digitsArray.length; i++) {
            list.add(Integer.parseInt(digitsArray[i]));
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        return sum;

    }
}