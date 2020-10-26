import java.util.stream.Stream;

import static java.lang.String.join;

public class Sorter {
    public static String sort(String string) {
        String reversed;
        Stream<String> stringStream = Stream.of(string.split(""));
        return reversed = join("", stringStream.sorted().toArray(String[]::new));
    }
}
