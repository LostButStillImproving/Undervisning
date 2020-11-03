package TenPointOne;

public class Time {

    private long hour;
    private long minute;
    private long second;

    Time(){

        long[] timeArray = currentTimeToArray(System.currentTimeMillis());

        this.hour = timeArray[0];
        this.minute = timeArray[1];
        this.second = timeArray[2];
    }

    Time(long hour, long minute, long second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time(int passedTimeMilisecods) {

        long[] timeArray = currentTimeToArray(passedTimeMilisecods);

        this.hour = timeArray[0];
        this.minute = timeArray[1];
        this.second = timeArray[2];
    }
    public long getMinute() {

        return minute;
    }

    public long getSecond() {

        return second;
    }

    public long getHour() {

        return hour;
    }
    public void setTime(long passedMilliseconds) {
        long[] timeArray = currentTimeToArray(passedMilliseconds);

        this.hour = timeArray[0];
        this.minute = timeArray[1];
        this.second = timeArray[2];
    }
    private long[] currentTimeToArray(long currentMilliTime) {

        long totalSeconds = currentMilliTime / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        return new long[]{currentHour, currentMinute, currentSecond};
    }

    @Override
    public String toString(){

        return hour + ":" + minute + ":" + second;
    }

  public static void main(String[] args) {
    Time time = new Time();
    Time time1 = new Time(555550000);
    Time time2 = new Time(5, 23, 5);

    System.out.println(time.toString());
    System.out.println(time1.toString());
    System.out.println(time2.toString());
  }
}
