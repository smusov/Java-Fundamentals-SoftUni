import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiplyEvensByOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] num = Arrays.stream(read.readLine().replace("-","").split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(method(num));

    }
    private static int method (int[] nums){
        int even=0;
        int odd =0;

        for (int num : nums) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }

        return even*odd;

    }
}
