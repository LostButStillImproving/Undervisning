package ThreePointFive;
import java.time.DayOfWeek;

public class method {
    int a = 5;
    static String run(int today, int days) {
        DayOfWeek currentDay;
        if(today ==0)
        {
            currentDay = DayOfWeek.of(today + 1);
        } else
        {
            currentDay = DayOfWeek.of(today);
        }

        DayOfWeek futureDay = currentDay.plus(days);
        return "Today is "+currentDay +" and the future day is "+futureDay;
    }
}
