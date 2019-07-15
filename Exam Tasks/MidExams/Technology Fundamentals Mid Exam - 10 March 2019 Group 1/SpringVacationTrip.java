import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpringVacationTrip {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(read.readLine());
        double budget = Double.parseDouble(read.readLine());
        int group = Integer.parseInt(read.readLine());
        double fuelPrice = Double.parseDouble(read.readLine());
        double foodPrice = Double.parseDouble(read.readLine());
        double hotelPriceForNight = Double.parseDouble(read.readLine());

        double hotelExpenses = (hotelPriceForNight * group) * days;
        double food = (foodPrice * days) * group;

        if (group > 10) {
            hotelExpenses *= 0.75;
        }

        double total = hotelExpenses + food;
        boolean check = true;

        for (int i = 1; i <= days; i++) {
            int travel = Integer.parseInt(read.readLine());

            total += travel * fuelPrice;

            if (i % 5 == 0 || i % 3 == 0) {
                total += total * 0.40;
            }
            if (i % 7 == 0) {
                total -= total / group;
            }
            if (total > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", total - budget);
                check = false;
                break;
            }
        }

        if (total <= budget) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - total);
        } else if (check) {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", total - budget);
        }
    }
}
