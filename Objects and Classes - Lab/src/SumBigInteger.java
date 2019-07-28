import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumBigInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        BigInteger firstInput = new BigInteger(read.readLine());
        BigInteger secondInput = new BigInteger(read.readLine());

        BigInteger result;

        result=firstInput.add(secondInput);

        System.out.println(result);

    }
}
