import SixPointFive.Methods;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixPointFiveTest {

    @Test
    static void MethodTest (){
        Methods methods = new Methods();

        double a = 1;
        double b = 2;
        double c = 3;
        List<Double> result = methods.displaySortedNumbers(a,b,c);
        List<Double> expectedResult = Arrays.asList(3.0,2.0,1.0);
        Assert.assertEquals(result,expectedResult);

    }
}
