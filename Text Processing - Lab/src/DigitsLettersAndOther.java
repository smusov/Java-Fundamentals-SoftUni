import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsLettersAndOther {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        Pattern pattern = Pattern.compile("(?<letters>[A-Za-z]*)(?<nums>[0-9]*)(?<other>[^A-Za-z0-9]*)");
        Matcher matcher = pattern.matcher(input);

        StringBuilder nums = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        while (matcher.find()) {

            nums.append(matcher.group("nums"));
            letters.append(matcher.group("letters"));
            other.append(matcher.group("other"));

        }
        System.out.println(nums);
        System.out.println(letters);
        System.out.println(other);
    }
}
