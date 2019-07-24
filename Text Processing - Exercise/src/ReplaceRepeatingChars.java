import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReplaceRepeatingChars {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        List<Character> result = new ArrayList<>();

        char lastSymbol = input.charAt(0);
        result.add(lastSymbol);

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i)!=lastSymbol){
                result.add(input.charAt(i));
                lastSymbol=input.charAt(i);
            }
        }
        System.out.println(result.toString().replaceAll("[\\[\\],\\s+]",""));
    }
}
