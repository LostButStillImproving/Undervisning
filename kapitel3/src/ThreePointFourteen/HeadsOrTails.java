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
    enum Face {
        Heads,
        Tails}

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        Face[] faces = Face.values();

        System.out.println("Heads or tails? [HEADS/TAILS]");
        String guess = scan.nextLine().strip().toUpperCase();

        String flip = faces[ran.nextInt(2)].toString().toUpperCase();
        System.out.println("I flipped " + flip);

        System.out.println("Did you guess correct?[Y/N]");
        String guessCorrect = scan.nextLine().strip().toUpperCase();

        if (guessCorrect.equals("Y") && flip.equals(guess)){
            System.out.println("Nice, ya won");
        } else if (guessCorrect.equals("Y") && !flip.equals(guess)){
            System.out.println("I think you're lying");
        } else if (guessCorrect.equals("N") && !flip.equals(guess)){
            System.out.println("That's too bad");
        } else if (guessCorrect.equals("N") && flip.equals(guess)){
            System.out.println("I think you'r misrembering things, I flipped a " + flip + " you guessed " + guess);
        } else {
            System.out.println("I think you gave me the wrong input");
        }
    }
}
