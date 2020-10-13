package SixPointTwelve;

public class SixPointTwelve {
    public static void printNumbers(int num1, int num2, int numberPerLine) {
        for (int i = num1; i <= num2; i++) {

            if ((i % numberPerLine == 0))  {
                System.out.format("%3d", i);
                System.out.println("");
            } else {
                System.out.format("%3d", i);
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(1,100,11);
    }
}
