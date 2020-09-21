package ThreePointTventyFour;

import java.util.Random;

public class PickACard {
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
    public static void main(String[] args) {
        Random ran = new Random();
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        String suit = suits[ran.nextInt(4)].toString();
        String rank = ranks[ran.nextInt(13)].toString();

        System.out.println("The card you picked is a " + rank + " of " + suit);
    }
}
