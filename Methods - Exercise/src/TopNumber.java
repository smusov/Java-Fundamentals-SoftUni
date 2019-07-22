import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopNumber {
    public static void main(String[] args)throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        for (int i = 1; i <=n ; i++) {
            if (checkDivisibleByEight(i)&&checkForOddNum(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkForOddNum(int i) {

        int[] nums = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();

        for (int num : nums) {
            if (num % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDivisibleByEight(int i) {
        int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        return sum % 8 == 0;
    }
}
