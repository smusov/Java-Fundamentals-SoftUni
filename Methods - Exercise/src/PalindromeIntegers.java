import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String num;
        while (!"END".equals(num=read.readLine())){
            StringBuilder reverse = new StringBuilder(num).reverse();
            if (num.equals(reverse.toString())){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
