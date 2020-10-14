package SixPointTwentySeven;

import java.util.ArrayList;

public class Emirp {
    static ArrayList<Integer> primes = new ArrayList<>();
    public static Boolean isPrime(int number){
        boolean flag = false;
        for(int i = 2; i <= number/2; ++i)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }
    public static Boolean isEmirp(int number){
       String numberString = Integer.toString(number);
       String reverseNumberString = "";

        for (int i = numberString.length() - 1; i >= 0 ; i--) {
            reverseNumberString = reverseNumberString + numberString.charAt(i);
        }
        Integer reverseNumber = Integer.parseInt(reverseNumberString);

        if (isPrime(reverseNumber))
            return true;
        return false;
    }
    public static void addToList(int number, ArrayList<Integer> primes){
        primes.add(number);
    }
    public static void getEmirps(int howMany) {
        int number = 1;
        while (Emirp.primes.size() <= howMany) {
            if (Emirp.isPrime(number) && Emirp.isEmirp(number) == true) {
                Emirp.addToList(number, Emirp.primes);
            }
            number++;
        }
    }
    public static void printSummary() {
        int i = 0;
         if (Emirp.primes.size() < 10){
             for (int j = 0; j < Emirp.primes.size() ; j++) {
                 System.out.format("%5d",Emirp.primes.get(i));
                 i++;
             }
         } else {
             for (int j = 0; j < 10 ; j++) {
                 System.out.format("%5d",Emirp.primes.get(i));
                 i++;
             }
         }

        System.out.println("");
        for (i = 11; i < Emirp.primes.size() ; i++) {
            if(i % 10 == 0) {
                System.out.format("%5d", Emirp.primes.get(i));
                System.out.println("");
            }
            else {
                System.out.format("%5d",Emirp.primes.get(i));
            }
        }
    }
}

