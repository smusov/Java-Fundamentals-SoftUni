import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Orders {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input;

        Map<String, Integer> productAndQuantity = new LinkedHashMap<>();
        Map<String, Double> productAndPrice = new LinkedHashMap<>();

        while (!"buy".equals(input = read.readLine())) {
            String[] data = input.split("\\s+");
            productAndQuantity.putIfAbsent(data[0], 0);
            productAndQuantity.put(data[0], productAndQuantity.get(data[0]) + Integer.parseInt(data[2]));
            productAndPrice.putIfAbsent(data[0], Double.parseDouble(data[1]));
            productAndPrice.put(data[0], Double.parseDouble(data[1]));
        }
        productAndPrice.forEach((key, value) -> {
            System.out.print(key + " -> ");
            productAndQuantity.forEach((key1, value1) -> {
                if (key1.equals(key)) {
                    System.out.println(String.format("%.2f", value * value1));
                }
            });
        });
    }
}
