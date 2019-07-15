import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInformation {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String name = read.readLine();
        int years = Integer.parseInt(read.readLine());
        double rating = Double.parseDouble(read.readLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,years,rating);

    }
}
