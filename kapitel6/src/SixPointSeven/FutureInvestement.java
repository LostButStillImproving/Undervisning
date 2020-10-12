package SixPointSeven;

public class FutureInvestement {

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate,int years) {
            double futureInvestement = investmentAmount * Math.pow((1 + monthlyInterestRate), years*12);

            return Math.round(futureInvestement*100)/100.0;
    }
}
