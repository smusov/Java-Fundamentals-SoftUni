import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[\\d]+|[\\d.\\d]+)!(?<quantity>[\\d]+)");

        List<String> furniture = new ArrayList<>();
        double sum = 0;

        while (!"Purchase".equals(input = read.readLine())) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                furniture.add(matcher.group("name"));
                sum += Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
            }
        }
        System.out.println("Bought furniture:");

        furniture.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f",sum);

    }
}
