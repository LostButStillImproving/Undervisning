import java.util.stream.Stream;

public class Sorter {
    public static String sort(String string) {
        Stream<String> stringStream = Stream.of(string.split(""));
        String[] reversed = stringStream.sorted().toArray(String[]::new);
        StringBuilder reversedStringBuilt = new StringBuilder();
        for (String s : reversed) {
            reversedStringBuilt.append(s);
        }
        String reversedString = reversedStringBuilt.toString();
        return reversedString;
    }
}
