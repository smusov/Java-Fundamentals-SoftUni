import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RefactoringPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(read.readLine());

        for (int i = 2; i <= num; i++) {

            boolean primeCheck = true;

            for (int k = 2; k < i; k++) {

                if (i % k == 0) {
                    primeCheck = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, primeCheck);
        }


    }
}
