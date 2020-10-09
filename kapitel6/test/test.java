import SixPointTwo.SumDigits;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class test {

    @Test
    void sumDigitsTest(){
        SumDigits sumDigits = new SumDigits();
        int result = sumDigits.sumDigits(10);
        assertEquals(1,result);


    }
}
