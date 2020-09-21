package ThreePointTventyFour;

import java.util.Random;

public class method {
    public enum Suit {
        Clubs,
        Diamond,
        Hearts,
        Spades
    }
    public enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    static String run(){
        Random ran = new Random();
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        String suit = suits[ran.nextInt(4)].toString();
        String rank = ranks[ran.nextInt(13)].toString();
        return "The card you picked is a " + rank + " of " + suit;
    }
}
