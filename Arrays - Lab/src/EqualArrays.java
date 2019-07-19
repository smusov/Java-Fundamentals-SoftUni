import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] firstArray = Arrays.stream(read.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(read.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                sum += secondArray[i];

            } else {
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                return;
            }
        }
        System.out.println(String.format("Arrays are identical. Sum: %s", sum));

    }
}
