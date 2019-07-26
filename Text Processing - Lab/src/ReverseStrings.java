import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while(!"end".equals(input=read.readLine())){

            StringBuilder builder = new StringBuilder();

            builder.append(input).reverse();

            System.out.println(String.format("%s = %s",input,builder.toString()));

        }
    }
}
