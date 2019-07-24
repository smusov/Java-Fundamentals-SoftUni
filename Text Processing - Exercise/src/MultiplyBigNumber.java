import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        BigInteger input = new BigInteger(read.readLine());
        BigInteger input2 = new BigInteger(read.readLine());

        BigInteger result = input.multiply(input2);

        System.out.println(result);

    }
}
