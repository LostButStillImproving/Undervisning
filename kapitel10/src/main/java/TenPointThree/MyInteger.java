package TenPointThree;

import org.apache.commons.math3.primes.Primes;

public class MyInteger {
    private int value;
    public MyInteger(int i) {
        this.value = i;
    }

    public static int parseInt(char[] chars) {
        StringBuilder intString = new StringBuilder();
        for (char c :chars ) {
            intString.append(c);
        }

        return Integer.parseInt(intString.toString()) ;
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {

            return true;
        } else
            return false;
    }

    public static boolean isEven(int i) {
        if (i % 2 == 0) {

            return true;
        } else
            return false;
    }

    public static boolean isEven(MyInteger myInteger) {
        return isEven(myInteger.value);
    }

    public boolean isOdd() {
        return !isEven();
    }

    public static boolean isOdd(int i) {
        return !isEven(i);
    }

    public static boolean isOdd(MyInteger myInteger) {
        return !isEven(myInteger);
    }

    public boolean isPrime() {
        return Primes.isPrime(this.value);
    }

    public static boolean isPrime(int i) {
        return Primes.isPrime(i);
    }

    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.value);
    }

    public boolean equals(int i) {
        if ( this.value == i) {

            return true;
        } else
            return false;
    }
    public boolean equals(MyInteger myInteger){
        return equals(myInteger.value);
    }
}
