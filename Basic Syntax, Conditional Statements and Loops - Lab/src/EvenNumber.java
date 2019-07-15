import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        while (n%2!=0){

            System.out.println("Please write an even number.");
            n= Integer.parseInt(read.readLine());

        }

        System.out.printf("The number is: %d",Math.abs(n));
    }
}
