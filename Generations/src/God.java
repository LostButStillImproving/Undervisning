import java.util.ArrayList;
import java.util.stream.IntStream;

public class God {


    public static  class One {
       One(generation) {
           System.out.println("Born as generation ");
           generation = generation;
        }
   }

    public static void main(String[] args) {
        int generetion = 10;
       One one = new One();
       ArrayList<Object> Creations = new ArrayList<>();
       Creations.add(new One());
    }

}
