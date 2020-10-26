import java.util.ArrayList;
import java.util.Random;

class Array {

    public enum COLORS {
        RED, BLUE, BLACK
    }

    public static <T extends Enum<?>> COLORS randomEnum(Class<COLORS> enumColors){
        Random random = new Random();
        int x = random.nextInt(enumColors.getEnumConstants().length);
        
        return enumColors.getEnumConstants()[x];
    }

    public static ArrayList<COLORS> randomArray(){
        Random random = new Random();
        ArrayList<COLORS> colorArray = new ArrayList<>();
        int randomLengthOfArray = random.nextInt(10);

        for (int i = 0; i < randomLengthOfArray; i++) {
            colorArray.add(randomEnum(COLORS.class));
        }

        return colorArray;
    }

    public static void main(String[] args) {
    randomArray().forEach(System.out::println);

    }
}
