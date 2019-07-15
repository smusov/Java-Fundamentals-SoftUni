import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Passed {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double grade = Double.parseDouble(read.readLine());

        if (grade>=3.00){
            System.out.println("Passed!");
        }

    }
}
