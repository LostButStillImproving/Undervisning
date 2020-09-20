package ThreePointFour;
import java.time.Month;
import java.util.Random;
/*
**3.4
(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly.
*/

public class RandomMonth {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(13) + 1;
        Month month = Month.of(number);
        System.out.println(month);
    }
}
