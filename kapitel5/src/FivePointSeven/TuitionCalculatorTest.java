package FivePointSeven;

public class TuitionCalculatorTest {
    public static class CalculatorTest {

        public CalculatorTest() throws TuitionCalculator.NotAPositiveNumberException {
        }

        public static void main(String[] args) throws TuitionCalculator.NotAPositiveNumberException {
            double startTuition = 100;
            double interest = 1.06;
            TuitionCalculator calculator = new TuitionCalculator(startTuition, interest);
            //input 10, expected output 17908
            int years = 10;
            double expectedResult = 17908;
            int result = (int) calculator.calculateTuitionPerYear(years);

            assertTrue(result, expectedResult);
        }
    }

    public static void main(String[] args) throws TuitionCalculator.NotAPositiveNumberException {

        double expectedResult;
        double result;
        double interest = 1.06;
        double startTuition = 10000;
        TuitionCalculator calculator = new TuitionCalculator(startTuition, interest);

        //input 10, expected output 17908
        int years = 10;
        expectedResult = 17908;
        result = (int) calculator.calculateTuitionPerYear(years);

        assertTrue(result, expectedResult);

        //input followYears = 2, fromYear = 10
        //expected output = 39104

        int followYears = 2;
        expectedResult = 39104;
        int fromYear = 10;
        result = calculator.calculateTotalTuition(followYears, fromYear);
        assertTrue(result, expectedResult);

        //test that it doesn't handle negative numbers
        followYears = -1;
        fromYear = 10;

        try {
            result = calculator.calculateTotalTuition(followYears, fromYear);
        } catch (Exception e){
            String error = e.getMessage();
            assertNotPositiveNumberError(error);
        }

    }

    static Boolean assertTrue(double result, double expectedResult) {
        if (result == expectedResult) {
            System.out.println("PASS");
            return true;
        } else {
            System.out.println("FAIL");
            return false;
        }
    }
    static Boolean assertNotPositiveNumberError(String error){
        if (error.equals("Not a positive number") ){
            System.out.println("PASS");
            return true;
        }
        return false;
    }
}
