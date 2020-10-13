import SixPointTwelve.RandomCharacter;

public class SixPointThirtyEight {

    static void GetRandoms() {
        for (int i = 1; i < 201; i++) {
            if (i % 10 == 0) {
                System.out.print(" "+RandomCharacter.getRandomUpperCaseLetter());
                System.out.println("");
            } else {
                System.out.print(" "+RandomCharacter.getRandomUpperCaseLetter());
            }
        }
        for (int i = 1; i < 201; i++) {
            if (i % 10 == 0) {
                System.out.print(" "+RandomCharacter.getRandomDigitCharacter());
                System.out.println("");
            } else {
                System.out.print(" "+RandomCharacter.getRandomDigitCharacter());
            }
        }
    }

    public static void main(String[] args) {
        GetRandoms();
    }
}
