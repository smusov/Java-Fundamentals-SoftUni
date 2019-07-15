import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloFrance {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays.stream(read.readLine().split("[|]+")).collect(Collectors.toList());
        double budget = Double.parseDouble(read.readLine());

        double profit = 0;
        List<Double> newPrices = new ArrayList<>();

        for (String item : input) {

            List<String> element = Arrays.asList(item.split("[\\->]+"));
            double price = Double.parseDouble(element.get(1));

            switch (element.get(0)) {

                case "Clothes":
                    if (price <= budget) {
                        if (price <= 50) {
                            budget -= price;
                            profit += price * 0.40;
                            newPrices.add(price * 1.40);
                        }
                    }
                    break;
                case "Shoes":
                    if (price <= budget) {
                        if (price <= 35.00) {
                            budget -= price;
                            profit += price * 0.40;
                            newPrices.add(price * 1.40);
                        }
                    }
                    break;
                case "Accessories":
                    if (price <= budget) {
                        if (price <= 20.50) {
                            budget -= price;
                            profit += price * 0.40;
                            newPrices.add(price * 1.40);
                        }
                    }
                    break;
            }
        }

        for (Double price : newPrices) {
            System.out.print(String.format("%.2f ", price));
        }

        System.out.println();
        System.out.println(String.format("Profit: %.2f", profit));

        double total = budget + newPrices.stream().mapToDouble(e -> e).sum();

        if (total >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }

    }
}
