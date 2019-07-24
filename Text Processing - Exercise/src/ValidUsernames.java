import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = read.readLine().split(", ");

        Pattern check = Pattern.compile("^([A-Za-z\\d\\-_]{3,16})$");

        for (String element : input) {
            Matcher matcher = check.matcher(element);
            if (matcher.find()){
                System.out.println(element);
            }
        }

    }
}
