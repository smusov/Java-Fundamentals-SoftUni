import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheHuntingGames {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(read.readLine());
        int players = Integer.parseInt(read.readLine());
        double energy = Double.parseDouble(read.readLine());
        double waterForOneDayPerPerson = Double.parseDouble(read.readLine());
        double foodForOneDayPerPerson = Double.parseDouble(read.readLine());

        double totalWater = (days * players) * waterForOneDayPerPerson;
        double totalFood = (days * players) * foodForOneDayPerPerson;

        for (int i = 1; i <= days; i++) {
            double loseEnergy = Double.parseDouble(read.readLine());
            energy -= loseEnergy;
            if (energy <= 0) {
                System.out.println(String.format("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater));
                return;
            }
            if (i % 2 == 0) {
                energy += energy * 0.05;
                totalWater -= totalWater * 0.30;
            }
            if (i % 3 == 0) {

                energy += energy * 0.10;
                totalFood -= totalFood / players;

            }
        }
        System.out.println(String.format("You are ready for the quest. You will be left with - %.2f energy!", energy));
    }
}
