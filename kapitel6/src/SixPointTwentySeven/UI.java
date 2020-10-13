package SixPointTwentySeven;

public class UI {

    public static void main(String[] args) {

        int number = 1;
        while (Emirp.primes.size() < 120) {
            if (Emirp.isPrime(number) && Emirp.isEmirp(number) == true) {
                Emirp.addToList(number, Emirp.primes);
            }
            number++;
        }
        int i = 0;
        for (int j = 0; j < 10 ; j++) {
            System.out.format("%5d",Emirp.primes.get(i));
            i++;
        }
        System.out.println("");
        for (i = 1; i < Emirp.primes.size() ; i++) {
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
