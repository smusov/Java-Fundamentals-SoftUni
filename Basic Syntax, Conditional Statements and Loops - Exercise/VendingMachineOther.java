import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VendingMachineOther {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double money = 0;

        List<Double> coins = Arrays.asList(0.1,0.2,0.5,1.00,2.00);
        String input;

        while (!"Start".equals(input = read.readLine())) {

            double coin = Double.parseDouble(input);

            if (coins.contains(coin)) {
                money += coin;
            } else {
                System.out.println(String.format("Cannot accept %.2f", coin));
            }

        }
        Map<String, Double> items = new LinkedHashMap<>();
        items.put("Nuts", 2.00);
        items.put("Water", 0.70);
        items.put("Crisps", 1.50);
        items.put("Soda", 0.80);
        items.put("Coke", 1.00);

        while (!"End".equals(input = read.readLine())) {

            if (items.containsKey(input)) {

                if (money >= items.get(input)) {
                    money -= items.get(input);

                    System.out.println("Purchased " + input);
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (!items.containsKey(input)) {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f\n", money);
    }
}