package cup;

import java.util.Timer;
import java.util.TimerTask;

public class TemperatureSensor {

    public static double temperatureNow;

    // Metode som beder det indbyggede termometer om at returnere temperaturen på indholdet
    public static double checkTemp(){

        double temp = 0;
        temperatureNow = temp;
        System.out.println("hi");
        return temp;
    }

}
