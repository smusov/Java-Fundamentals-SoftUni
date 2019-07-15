import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class RageExpenses {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int lostGames = Integer.parseInt(read.readLine());
        double headSetPrice = Double.parseDouble(read.readLine());
        double mousePrice = Double.parseDouble(read.readLine());
        double keyboardPrice = Double.parseDouble(read.readLine());
        double displayPrice = Double.parseDouble(read.readLine());

        Map<String, Integer> elements = new LinkedHashMap<>();

        elements.put("headset", 0);
        elements.put("mouse", 0);
        elements.put("keyboard", 0);
        elements.put("display", 0);

        for (int i = 1; i <= lostGames; i++) {

            if (i % 2 == 0) {
                elements.put("headset", elements.get("headset") + 1);
            }

            if (i % 3 == 0) {
                elements.put("mouse", elements.get("mouse") + 1);
            }

            if (i % 2 == 0 && i % 3 == 0) {
                elements.put("keyboard", elements.get("keyboard") + 1);
                if (elements.get("keyboard") % 2 == 0) {
                    elements.put("display", elements.get("display") + 1);
                }
            }
        }

        double total = (elements.get("headset") * headSetPrice) + (elements.get("mouse") * mousePrice)
                     + (elements.get("keyboard") * keyboardPrice) + elements.get("display") * displayPrice;

        System.out.println(String.format("Rage expenses: %.2f lv.", total));
    }
}