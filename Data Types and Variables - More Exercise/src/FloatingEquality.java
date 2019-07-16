import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatingEquality {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(read.readLine());
        double b = Double.parseDouble(read.readLine());
        double maxDiff = 0.000001;
        double abs = Math.abs(a-b);

        if (abs<maxDiff){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
