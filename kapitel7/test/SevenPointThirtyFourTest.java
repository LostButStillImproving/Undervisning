import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SevenPointThirtyFourTest {

    @Test
    void sortTest(){
        Sorter sorter = new Sorter();
        String input = "BCA";
        String expectedResult = "ABC";
        String result = Sorter.sort(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
