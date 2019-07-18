import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        Pattern pattern = Pattern.compile("\\+359([ |\\-])2\\1(\\d{3})\\1(\\d{4})\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> result = new ArrayList<>();

        while (matcher.find()){
            result.add(matcher.group());
        }
        System.out.println(result.toString().replaceAll("[\\[\\]]", ""));
    }
}
