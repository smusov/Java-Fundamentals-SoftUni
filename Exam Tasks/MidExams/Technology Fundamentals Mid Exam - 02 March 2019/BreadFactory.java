import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BreadFactory {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String>data = Arrays.stream(read.readLine().split("[\\|]+")).filter(e->!e.equals(" ")).collect(Collectors.toList());

        int energy = 100;
        int coins = 100;

        for (String datum : data) {
            String[] com = datum.split("[\\-]+");

            switch (com[0]) {
                case "rest":
                    int addEnergy = Integer.parseInt(com[1].trim());

                    if (energy + addEnergy < 100) {
                        energy += addEnergy;
                        System.out.println(String.format("You gained %d energy.", addEnergy));
                    } else {
                        int energyToAdd = 100 - energy;
                        energy += energyToAdd;
                        System.out.println(String.format("You gained %d energy.", energyToAdd));
                    }
                    System.out.println(String.format("Current energy: %d.", energy));
                    break;
                case "order":
                    if (energy >= 30) {
                        coins += Integer.parseInt(com[1].trim());
                        energy -= 30;
                        System.out.println(String.format("You earned %s coins.",com[1].trim()));
                    } else {
                        energy += 50;
                        System.out.println("You had to rest!");
                    }
                    break;
                default:
                    if (coins-Integer.parseInt(com[1].trim()) > 0) {
                        coins -= Integer.parseInt(com[1].trim());
                        System.out.println(String.format("You bought %s.", com[0]));
                    } else {
                        System.out.println(String.format("Closed! Cannot afford %s.", com[0]));
                        return;
                    }
                    break;
            }
        }
        System.out.println("Day completed!");
        System.out.println(String.format("Coins: %d",coins));
        System.out.println(String.format("Energy: %d",energy));
    }
}
