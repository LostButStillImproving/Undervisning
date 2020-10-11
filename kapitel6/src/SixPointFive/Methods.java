package SixPointFive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public List<Double> displaySortedNumbers(double a, double b, double c){

        List<Double> list = Arrays.asList(a,b,c);
        List<Double> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sortedList;
    }
}
