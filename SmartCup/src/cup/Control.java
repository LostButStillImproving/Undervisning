package cup;

import java.util.Timer;
import java.util.TimerTask;

import static cup.TemperatureSensor.*;

public class Control {


    public static void main(String[] args) {
        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            public double temp;

            @Override
            public void run() {
                temp = checkTemp();
            }
        }, 1000,5000);
    }



}