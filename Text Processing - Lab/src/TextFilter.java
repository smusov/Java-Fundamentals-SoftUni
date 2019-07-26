import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split(", ");
        String text = read.readLine();

        for (String word : input) {
            if (text.contains(word)){
                text=text.replace(word,returnCountStars(word));
            }
        }
        System.out.println(text);
    }
    private static String returnCountStars(String input) {

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            text.append("*");
        }
        return text.toString();
    }
}
