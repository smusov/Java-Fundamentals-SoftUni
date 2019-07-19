import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int [] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(read.readLine());

        for (int i = 0; i < input.length; i++) {
            int sum ;

            for (int j = i+1; j <input.length ; j++) {
                sum=input[i]+input[j];

                if (sum==num){
                    System.out.println(input[i]+" "+input[j]);
                }

            }
        }
    }
}
