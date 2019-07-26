import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String s : input) {
            result.append(s.repeat(s.length()));
        }
        System.out.println(result);
    }
}
