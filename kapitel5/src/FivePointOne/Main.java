package FivePointOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        while(true) {

            System.out.println("Enter your score: ");
            score = scan.nextInt();
            String result = Method.checkScore(score);

            if (result.equals("break")){
                break;
            } else System.out.println(result);
        }
        System.out.println("No numbers are entered except 0");
    }
}
