import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int []numbers = Arrays.stream(read.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <numbers.length ; i++) {

            boolean isGreater = true;

            for (int j = i+1; j < numbers.length ; j++) {

                if (numbers[i]<=numbers[j]){
                    isGreater=false;
                    break;
                }
            }

            if (isGreater){
                System.out.print(numbers[i]+" ");
            }
        }

    }
}
