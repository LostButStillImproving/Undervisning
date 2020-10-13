import SixPointTwentySeven.Emirp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SixPointTwentySevenTest {

    @Test
    static void isPrimeTest(){
        int number = 2;
        Boolean result = Emirp.isPrime(number);
        Boolean expectedResult = true;
        Assert.assertEquals(result, expectedResult);

    }

    @Test
    static void isEmirpTest(){
        int prime = 5;
        Boolean result = Emirp.isEmirp(prime);
        Boolean expectedResult = true;
        Assert.assertEquals(result, expectedResult);
    }
}
