import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[]nums = new int[3];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=Integer.parseInt(read.readLine());
        }
        printSmallNumber(nums);
    }
    private static void printSmallNumber(int[]nums){
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println(min);

    }

}
