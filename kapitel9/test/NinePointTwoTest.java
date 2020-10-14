import NinePointTwo.Stock;
import org.junit.Assert;
import org.junit.Test;

public class NinePointTwoTest {

    @Test
    public void getChangePercentTest(){
        Stock stock = new Stock("APPL", "APPLE");
        stock.currentPrice = 1.0;
        stock.previousClosingPrice = 0.5;

        Double expectedResult = 100.0;
        Double result = stock.getChangePercent();
        Assert.assertEquals(expectedResult, result);
    }
}
