package ThreePointFourteen;

import java.util.Random;
import java.util.Scanner;

public class method {

    enum Face {
        Heads,
        Tails}
    static String flipCoin(){
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        Face[] faces = Face.values();
        String flip = faces[ran.nextInt(2)].toString().toUpperCase();
        System.out.println("I flipped " + flip);
        return flip;
    }
    static String checkWinner(String guessCorrect, String flip, String guess){
        if (guessCorrect.equals("Y") && flip.equals(guess)){
            return "Nice, ya won";
        } else if (guessCorrect.equals("Y") && !flip.equals(guess)){
            return "I think you're lying";
        } else if (guessCorrect.equals("N") && !flip.equals(guess)){
            return "That's too bad";
        } else if (guessCorrect.equals("N") && flip.equals(guess)){
            return "I think you'r misrembering things, I flipped a " + flip + " you guessed " + guess;
        } else {
            return "I think you gave me the wrong input";
        }

    }
}
