import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RefactorSpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int number = 0;

        for (int i = 1; i <= n; i++) {
            int counter = i;
            while (i > 0) {
                number += i % 10;
                i /= 10;
            }
            if (number == 5 ||number == 7 || number == 11){
                System.out.printf("%d -> %s%n", counter,"True");
            }else {
                System.out.printf("%d -> %s%n", counter,"False");
            }
            number = 0;
            i = counter;
        }
    }
}
