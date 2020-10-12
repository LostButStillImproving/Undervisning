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
        IntStream.rangeClosed(1,10).forEach(i -> System.out.println(i + "\t\t\t" + FutureInvestement
                                                      .futureInvestmentValue(  amountInvested,
                                                                              monthlyInterestRate, i)));
    }
}
