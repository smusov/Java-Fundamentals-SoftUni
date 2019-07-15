import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundsToDollars {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double input = Double.parseDouble(read.readLine());
        
        double converted = input*1.31;

        System.out.printf("%.3f",converted);
    
    }

}
