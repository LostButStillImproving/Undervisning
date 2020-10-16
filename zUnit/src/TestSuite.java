import SixPointTwo.SumDigits;
import com.testing.kapitel1.opgaver;

public class TestSuite {
    static String Test1(){
        SumDigits sumDigits = new SumDigits();
        int i = 10;
        int result = sumDigits.sumDigits(i);
        int expectedResult = 1;
        return Assertions.assertEqual(result,expectedResult);
    }
    static String AddUpToNtest(){
        int i = 5;
        int result = opgaver.AddupToN(i);
        int expectedResult = 15;
        return Assertions.assertEqual(result,expectedResult);
    }
}
