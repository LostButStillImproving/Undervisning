package FivePointSeven;

public class Main {
    public static void main(String[] args) throws TuitionCalculator.NotAPositiveInt {
        TuitionCalculator calculator = new TuitionCalculator(10000, 1.06);
        System.out.print("Your tuition in 10 years is: ");
        System.out.println(calculator.calculateTuitionPerYear(10));
        System.out.print("Your total cost for 4 years of tuition after 10 years is: ");
        System.out.println(calculator.calculateTotalTuition(-1, 10));

    }
}
