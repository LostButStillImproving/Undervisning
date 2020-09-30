package FivePointOne;

public class MethodTest {

    public static void main(String[] args) {

        System.out.println("Testing passing score");
        int testScore = 60;
        String expectedResult = "You pass the exam.";
        String result = Method.checkScore(testScore);
        testResult(result, expectedResult);

        System.out.println("Testing failing score");
        testScore = 59;
        expectedResult = "You don't pass the exam.";
        result = Method.checkScore(testScore);
        testResult(result, expectedResult);

        System.out.println("Testing exit condition");
        testScore = -1;
        expectedResult = "break";
        result = Method.checkScore(testScore);
        testResult(result, expectedResult);
    }

    static void testResult(String result, String expectedResult){
        if (result.equals(expectedResult)){
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}
