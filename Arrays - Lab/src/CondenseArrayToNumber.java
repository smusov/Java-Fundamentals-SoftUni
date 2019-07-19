import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CondenseArrayToNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(read.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (input.length > 1) {

            int[] condensed = new int[input.length - 1];

            for (int i = 0; i < condensed.length; i++) {

                condensed[i] = input[i] + input[i + 1];
            }

            input = condensed;
        }
        System.out.println(input[0]);

    }
}
