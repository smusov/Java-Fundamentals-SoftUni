import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MathOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double firstNumber = Double.parseDouble(read.readLine());
        String operation = read.readLine();
        double secondNumber = Double.parseDouble(read.readLine());

        System.out.println(new DecimalFormat("#.##").format(calculating(firstNumber, operation, secondNumber)));

    }
    private static double calculating (double firstNumber, String operation , double secondNumber){
        double result =0;
        switch (operation){
            case "/":
                result=firstNumber/secondNumber;
                break;
            case "*":
                result=firstNumber*secondNumber;
                break;
            case "+":
                result=firstNumber+secondNumber;
                break;
            case "-":
                result=firstNumber-secondNumber;
                break;
        }
        return result;

    }
}
