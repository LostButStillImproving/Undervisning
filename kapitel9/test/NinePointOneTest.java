import NinePointOne.NinePointOne;
import org.junit.Assert;
import org.junit.Test;

public class NinePointOneTest {

    @Test
    public void createRectangleTest(){
        NinePointOne.rectangle r = new NinePointOne.rectangle();
        Boolean isInstanceOf = false;
        if (r instanceof NinePointOne.rectangle) {
            isInstanceOf = true;
        Assert.assertTrue(isInstanceOf);
        }
    }

    @Test
    public void getPerimiterTest(){
        NinePointOne.rectangle r = new NinePointOne.rectangle(2.0,2.0);
        Double expectedResult = 4.0;
        Double result = r.getArea();
        Assert.assertEquals(expectedResult, result);


    }
}
