import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class VaporWinterSale {

    public static class Game {
        private String name;
        private String DLC;
        private double price;

        String getName() {
            return name;
        }

        String getDLC() {
            return DLC;
        }

        double getPrice() {
            return price;
        }

        void setName(String name) {
            this.name = name;
        }

        void setDLC(String DLC) {
            this.DLC = DLC;
        }

        void setPrice(double price) {
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split(", ");

        List<Game> games = new ArrayList<>();

        for (String element : input) {

            Game game = new Game();
            String[] data;

            if (element.contains("-")) {
                data = element.split("-");
                game.setName(data[0]);
                game.setPrice(Double.parseDouble(data[1]));
                games.add(game);
            } else if (element.contains(":")) {
                data = element.split(":");
                setDLC(games, data[0], data[1]);
            }
        }

        for (Game value : games) {
            if (value.getDLC() == null) {
                double newPrice = value.getPrice() * 0.80;
                value.setPrice(newPrice);
            } else {
                double newPrice = value.getPrice() * 0.50;
                value.setPrice(newPrice);
            }
        }

        Map<String, Double> resultDLC = new LinkedHashMap<>();
        Map<String, Double> result = new LinkedHashMap<>();

        for (Game element : games) {
            if (element.getDLC() != null) {
                resultDLC.put(element.getName() + " - " + element.getDLC() + " - ", element.getPrice());
            } else {
                result.put(element.getName() + " - ", element.getPrice());
            }
        }

        resultDLC.entrySet().stream().sorted(Comparator.comparingDouble(Map.Entry::getValue)).
                forEach(e -> System.out.println(String.format("%s%.2f", e.getKey(), e.getValue())));

        result.entrySet().stream().sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> System.out.println(String.format("%s%.2f", e.getKey(), e.getValue())));
    }

    private static void setDLC(List<Game> games, String game, String DLC) {
        for (Game value : games) {

            if (value.getName().equals(game)) {
                value.setDLC(DLC);
                double newPrice = value.getPrice() * 1.20;
                value.setPrice(newPrice);
                break;
            }
        }
    }
}
