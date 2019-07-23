import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(read.readLine().split("\\s+")).filter(e->e.length()%2==0).forEach(System.out::println);

    }
}
