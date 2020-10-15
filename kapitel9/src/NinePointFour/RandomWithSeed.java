package NinePointFour;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomWithSeed {
    public static void main(String[] args) {
        Random random = new Random(1000);
        IntStream.range(0,50).forEach(i -> System.out.println(random.nextInt(100)));
    }
}