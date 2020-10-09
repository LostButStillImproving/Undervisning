package SixPointTwo;

import SixPointTwo.SumDigits;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SumDigits sumDigits = new SumDigits();
        System.out.println("Gimme an Integer");
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(sumDigits.sumDigits(number));
    }
}

