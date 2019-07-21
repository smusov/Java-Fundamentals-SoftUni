import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculations {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String action = read.readLine();
        double a = Double.parseDouble(read.readLine());
        double b = Double.parseDouble(read.readLine());

        switch (action){
            case "add":
                add(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
        }
    }
    private static void add(double a , double b ){
        System.out.println(String.format("%.0f",a+b));
    }
    private static void multiply (double a , double b ){
        System.out.println(String.format("%.0f",a*b));
    }
    private static void subtract (double a , double b ){
        System.out.println(String.format("%.0f",a-b));
    }
    private static void divide (double a , double b ){
        System.out.println(String.format("%.0f",a/b));

    }
}
