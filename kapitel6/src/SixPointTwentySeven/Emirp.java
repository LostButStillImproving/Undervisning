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
}

