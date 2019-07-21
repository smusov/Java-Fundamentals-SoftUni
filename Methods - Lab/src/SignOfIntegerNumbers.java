import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignOfIntegerNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(read.readLine());
        name(number);

    }

    private static void name (int n){
        if (n>=1){
            System.out.printf("The number %d is positive.",n);
        }else if (n<0){
            System.out.printf("The number %d is negative.",n);
        }else {
            System.out.println("The number 0 is zero.");
        }

    }
}
