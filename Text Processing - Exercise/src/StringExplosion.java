import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosion {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String text = read.readLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol == '>') {
                result.append(">");
                i++;
                int explosion = text.charAt(i) - '0';
                explosion--;

                while (explosion > 0 && i < text.length() - 1) {
                    i++;
                    symbol = text.charAt(i);
                    if (symbol == '>') {
                        result.append(">");
                        i++;
                        explosion += text.charAt(i) - '0';
                        explosion--;
                        continue;
                    }
                    explosion--;
                }

            } else {
                result.append(symbol);
            }
        }

        System.out.println(result);
    }
}
