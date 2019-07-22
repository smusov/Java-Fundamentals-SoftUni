import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().toLowerCase().split("");
        System.out.println(vowelsCount(input));
    }

    private static int vowelsCount(String[] word) {
        String sym = "aeoui";
        int sum = 0;

        for (String s : word) {
            if (sym.contains(s)) {
                sum++;
            }
        }

        return sum;
    }
}
