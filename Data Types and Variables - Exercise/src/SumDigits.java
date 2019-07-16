import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String number = read.readLine();

        int sume = 0;

        for (int i = 0; i < number.length(); i++) {

            sume+= Integer.parseInt(String.valueOf(number.charAt(i)));

        }
        System.out.println(sume);

    }
}
