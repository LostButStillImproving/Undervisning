package ThreePointFour;

import java.time.Month;
import java.util.Random;

public class method {
    static String run(){
        Random ran = new Random();
        int number = ran.nextInt(13) + 1;
        Month month = Month.of(number);
        return month.toString();
    }
}
