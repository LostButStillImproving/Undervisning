package ThreePointThirtyFive;

public class method {
    static String run(int number) {
        int oddOrNot = number % 2;
        String result = "";
        switch (oddOrNot) {
            case 1 -> {
                result = "The number is odd";
            }
            case 0 -> {
                result = "The number is even";
            }
        }
        return result;
    }
}