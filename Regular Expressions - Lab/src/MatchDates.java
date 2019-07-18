import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        Pattern pattern= Pattern.compile("([\\d]{2})([.\\-/])([A-Z][a-z]{2})\\2([\\d]{4})");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s\n",matcher.group(1),matcher.group(3),matcher.group(4));
        }
    }
}
