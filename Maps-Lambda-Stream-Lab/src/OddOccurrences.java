import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> words = Arrays.stream(read.readLine().toLowerCase().split("\\s+")).collect(Collectors.toList());

        Map<String,Integer> count = new LinkedHashMap<>();

        words.forEach(e->{
            count.putIfAbsent(e,0);
            count.put(e,count.get(e)+1);
        });

        StringBuilder print = new StringBuilder();

        count.forEach((key, value) -> {
            if (value % 2 != 0) {
               print.append(key).append(", ");
            }
        });
        System.out.println(print.deleteCharAt(print.lastIndexOf(", ")));
    }
}
