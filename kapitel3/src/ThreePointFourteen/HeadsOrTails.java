package ThreePointFourteen;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

/**
 (Game: heads or tails) Write a program that lets the user guess whether the flip of
 a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 which represents head or tail. The program prompts the user to enter a guess, and
 reports whether the guess is correct or incorrect.
 */
public class HeadsOrTails {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Heads or tails? [HEADS/TAILS]");
        String guess = scan.nextLine().strip().toUpperCase();

        String flip = method.flipCoin();

        System.out.println("Did you guess correct?[Y/N]");
        String guessCorrect = scan.nextLine().strip().toUpperCase();

        System.out.println(method.checkWinner(guessCorrect, flip, guess));

    }
}
