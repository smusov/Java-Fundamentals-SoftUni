import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String input = read.readLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i)+3;

            result.append((char)num);
        }
        System.out.println(result);
    }
}
