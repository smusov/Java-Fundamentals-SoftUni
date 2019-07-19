import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("[, ]");

        Map<String, String> demons = new TreeMap<>();


        for (String data : input) {

            if (!data.equals("")) {

                int health = findHealth(data);
                double damage = findDamage(data);
                damage = otherOperation(data, damage);

                demons.put(data, String.format(" - %d health, %.2f damage", health, damage));

            }

        }
        demons.forEach((key, value) -> System.out.println(key + value));
    }

    private static int findHealth(String input) {
        Pattern healthRegex = Pattern.compile("[^0-9+\\-*/.]+");
        Matcher matchHealth = healthRegex.matcher(input);

        int health = 0;

        while (matchHealth.find()) {
            String findText = matchHealth.group();

            for (int i = 0; i < findText.length(); i++) {
                health += findText.charAt(i);
            }
        }
        return health;
    }

    private static double findDamage(String input) {
        Pattern damage = Pattern.compile("([\\d.]+)|(-[\\d.]+)");
        Matcher matchDamage = damage.matcher(input);

        double sum = 0;

        while (matchDamage.find()) {
            sum += Double.parseDouble(matchDamage.group());
        }
        return sum;
    }

    private static double otherOperation(String input, double damage) {

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '*') {
                damage *= 2;
            } else if (input.charAt(i) == '/') {
                if (damage != 0) {
                    damage /= 2;
                }
            }
        }
        return damage;
    }
}
