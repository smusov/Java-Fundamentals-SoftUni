import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        long first =  Integer.parseInt(read.readLine());
        long second = Integer.parseInt(read.readLine());
        double result = factorial(first) / factorial(second);

        System.out.printf("%.2f", result);
    }

    private static double factorial(long n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));

    }
}
