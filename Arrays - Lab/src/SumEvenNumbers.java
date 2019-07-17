import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[]arg = read.readLine().split(" ");

        int[] nums = new int[arg.length];

        int sum=0;

        for (int i = 0; i < nums.length ; i++) {

            nums[i]= Integer.parseInt(arg[i]);

            if (nums[i]%2==0){
                sum+=nums[i];
            }
        }
        System.out.println(sum);

    }
}
