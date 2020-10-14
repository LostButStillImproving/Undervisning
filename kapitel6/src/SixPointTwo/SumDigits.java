package SixPointTwo;

import java.util.ArrayList;
import java.util.List;

public class SumDigits {
    public int sumDigits(long n){
        String digitsString = Long.toString(n);
        String[] digitsArray = digitsString.split("");
        List<Integer> listOfDigits = new ArrayList<>();

        for (String digit:digitsArray) {
            listOfDigits.add(Integer.parseInt(digit));
        }
        return listOfDigits.stream().mapToInt(Integer::intValue).sum();

    }
}