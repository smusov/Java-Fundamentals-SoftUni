import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while(!"end".equals(input=read.readLine())){

            StringBuilder bilder = new StringBuilder();

            bilder.append(input).reverse();

            System.out.println(String.format("%s = %s",input,bilder.toString()));

        }
    }
}
