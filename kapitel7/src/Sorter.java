import java.util.stream.Stream;

import static java.lang.String.join;

public class Sorter {
    public static String sort(String string) {
        Stream<String> stringStream = Stream.of(string.split(""));
        String reversed = join("", stringStream.sorted().toArray(String[]::new));
        return reversed;
    }
}
