import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MathPower {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double pow = Double.parseDouble(read.readLine());
        double number = Double.parseDouble(read.readLine());

        System.out.println(new DecimalFormat("0.####").format(power(pow,number)));
    }
    private static double power (double power , double number){

        return Math.pow(power,number);

    }
}
