import SixPointSeven.FutureInvestement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SixPointSevenTest {

    @Test
    static void MethodTest (){
        double amountInvested = 1000;
        double annualInterestRate = 0.09;
        double monthlyInterestRate = annualInterestRate/12;
        int years = 1;
        double expectedValue = 1093.80;

        double result = FutureInvestement.futureInvestmentValue(amountInvested,
                                                               monthlyInterestRate,
                                                                         years);

        Assert.assertEquals(result, expectedValue);


    }

}
