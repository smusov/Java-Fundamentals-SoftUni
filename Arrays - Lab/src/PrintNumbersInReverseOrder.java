import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        String[] numbers = new String[n];

        for (int i = 0; i <n ; i++) {

            numbers[i] = String.valueOf(read.readLine());
        }
        for (int i = numbers.length-1; i >=0 ; i--) {

            System.out.print(numbers[i]+" ");
        }

    }
}
