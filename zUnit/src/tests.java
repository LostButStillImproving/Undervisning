import SixPointTwo.SumDigits;
import com.testing.kapitel1.opgaver;

public class tests {
    static String Test1(){
        SumDigits sumDigits = new SumDigits();
        int i = 10;
        int result = sumDigits.sumDigits(i);
        int expectedResult = 1;
        return Assertions.assertEqual(result,expectedResult);
    }
    static String AddUpToNtest(){
        opgaver opgaver = new opgaver();
        int i = 5;
        int result = opgaver.AddupToN(i);
        int expectedResult = 14;
        return Assertions.assertEqual(result,expectedResult);
    }
}
