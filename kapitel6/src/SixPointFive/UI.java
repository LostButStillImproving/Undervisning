package SixPointFive;

import java.util.List;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Methods methods = new Methods();
        double a; double b; double c;

        System.out.println("Supply 3 numbers you want sorted in decreasing order");

        a = scan.nextDouble();
        b= scan.nextDouble();
        c = scan.nextDouble();

        List<Double> result = methods.displaySortedNumbers(a,b,c);
        for (Double i:result
             ) {
            System.out.println(i);
        }
    }
}
