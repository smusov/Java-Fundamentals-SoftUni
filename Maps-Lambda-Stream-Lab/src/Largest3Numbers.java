import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Largest3Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).sorted(Collections.reverseOrder()).limit(3).forEach(e-> System.out.print(e+" "));

    }
}