import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharsInAString {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());

        Map<String,Integer> count = new LinkedHashMap<>();

        for (String s : input) {
            String[] data = s.split("");
            for (String datum : data) {
                count.putIfAbsent(datum, 0);
                count.put(datum, count.get(datum) + 1);
            }
        }
        count.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
