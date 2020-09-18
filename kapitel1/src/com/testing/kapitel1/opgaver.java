package com.testing.kapitel1;

public class opgaver {
    //1.6
    public static int AddupToN(int n) {
        int sum;
        sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        //1.1
        System.out.println("#1.1");
        System.out.println("welcome to java");
        System.out.println("learning Java Now");
        System.out.println("programming is fun");
        //1.2
        System.out.println("#1.2");
        for (int i = 0; i < 6; i++) {
            System.out.println("I love Java");
        }
        //1.3
        System.out.println("#1.3");
        System.out.println("    J");
        System.out.println("J   aaa    v    vaaa");
        System.out.println("J   J  a     v v   a a");
        System.out.println("J    aaaa     v    aaaa");
        //1.4
        System.out.println("#1.4");
        System.out.println("a   a^2   a^3   a^4");
        System.out.println("1     1     1     1 ");
        System.out.println("2     4     6     16");
        System.out.println("3     9     27    81");
        System.out.println("4     16    64    256");
        //1.5
        System.out.println("#1.5");
        System.out.print("7.5*6.5-4.5*3)/(47.5 -5.5) = ");
        System.out.println((7.5*6.5-4.5*3)/(47.5 -5.5));
        //1.6
        System.out.println("#1.6");
        System.out.println(AddupToN(10));

        //1.12
        System.out.println("#1.12");
        int distance = 24;
        double distanceinKM = distance*1.6;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        int timeinSeconds = hours*3600+minutes*60+seconds;
        System.out.print("time in seconds: ");
        System.out.println(timeinSeconds);
        double timeinHours = (float)timeinSeconds/3600;
        System.out.print("time in hours: ");
        System.out.println(timeinHours);
        double speedinK = distanceinKM/timeinHours;
        System.out.print("speed in kmh: ");
        System.out.println(speedinK);
    }

}
