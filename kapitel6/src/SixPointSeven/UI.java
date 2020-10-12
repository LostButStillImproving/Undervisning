package SixPointSeven;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("The amount invested: ");
        double amountInvested = Double.parseDouble(scan.nextLine());

        System.out.println("Annueal interest rate: ");
        double annualInterestRate = Double.parseDouble(scan.nextLine());
        double monthlyInterestRate = annualInterestRate/12;


        System.out.println("Years\t\tFuture Value");
        for (Integer i: IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList())
             ) {
            System.out.print(i + "\t\t\t\t");
            System.out.println(FutureInvestement.futureInvestmentValue(amountInvested, monthlyInterestRate, i));
        }

    }
}
