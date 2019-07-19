import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAndOddSubtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = read.readLine().split(" ");

        int [] num = new int[numbers.length];

        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i < numbers.length ; i++) {
            num[i]= Integer.parseInt(numbers[i]);

            if (num[i]%2==0){
                evenSum+=num[i];
            }else {
                oddSum+=num[i];
            }
        }

        System.out.println(evenSum-oddSum);

    }
}
