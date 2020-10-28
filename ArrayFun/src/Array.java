import java.util.ArrayList;
import java.util.Random;

class Array {

    enum COLORS {
        RED, BLUE, BLACK, PURPLE
    }
    static ArrayList<COLORS> colorArrayList = new ArrayList<>();

    static COLORS randomColor(){
        Random random = new Random();
        return COLORS.values()[random.nextInt(COLORS.values().length)];
    }
   static ArrayList<COLORS> randomArray(){
        Random random = new Random();

        int randomLengthOfArray = (random.nextInt(10) + 1);

        for (int i = 0; i < randomLengthOfArray; i++) {

            colorArrayList.add(randomColor());
        }

        return colorArrayList;
    }

    public static void main(String[] args) {
    randomArray().forEach(System.out::println);
    }
}
