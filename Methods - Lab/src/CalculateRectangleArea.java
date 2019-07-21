import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateRectangleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        double a = Double.parseDouble(read.readLine());
        double b = Double.parseDouble(read.readLine());

        System.out.println(String.format("%.0f", area(a, b)));

    }

    private static double area(double a, double b) {

        return (a * b);
    }

}

