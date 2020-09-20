package ThreePointFive;
import java.time.DayOfWeek;
import java.util.Scanner;
/**
 *3.5
 (Find future dates) Write a program that prompts the user to enter an integer for
 today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 prompt the user to enter the number of days after today for a future day and display
 the future day of the week
  */
public class DaysFromToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter todays date: ");
        int today = scan.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int days = scan.nextInt();
        DayOfWeek currentDay;
        if (today == 0) {
            currentDay = DayOfWeek.of(today + 1);
        } else {
            currentDay = DayOfWeek.of(today);
        }
        DayOfWeek futureDay = currentDay.plus(days);
        System.out.println("Today is " + currentDay + " and the future day is " + futureDay);
    }
}
