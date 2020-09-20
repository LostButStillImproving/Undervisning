package ThreePointFour;
import java.time.Month;
import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(13) + 1;
        Month month = Month.of(number);
        System.out.println(month);
    }
}
