import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerOrUpper {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        char input = read.readLine().charAt(0);

        if (Character.isLowerCase(input)){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }

    }
}
