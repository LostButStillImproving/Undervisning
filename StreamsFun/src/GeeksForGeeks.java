import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class GeeksForGeeks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        long count = list.stream().distinct().count();
        System.out.println(count);
        //Iterating
        ArrayList<String> list1 = new ArrayList<>();

        Boolean match = list1.stream()
                        .anyMatch(element -> element
                        .contains(Integer.toString(2)));
        System.out.println(match);

        //Filtering
        Stream<Integer> streamOfInts = list.stream().filter(element -> element % 2 == 0);
        System.out.println(streamOfInts.toArray()[0]);

        //Mapping
        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");
        Stream<Path> stream = uris.stream().map(uri -> Paths.get(uri));
        System.out.println(stream.toArray()[0]);

        //reduce
        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a * b);
        System.out.println(reduced);

        //collecting
        List<String> resultList
                = uris.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        resultList.add("hi");;
        System.out.println(resultList.get(0));
        System.out.println(resultList.get(1));



        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        Stream<Boolean> reversedBooleans = booleans.stream().map(element -> !element);
        for (Object bool:reversedBooleans.toArray()
             ) {
            System.out.println(bool.getClass().getSimpleName());

        }
    }
}
