import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadawanEquipment {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double money = Double.parseDouble(read.readLine());
        int student = Integer.parseInt(read.readLine());
        double priceOfLightSabers = Double.parseDouble(read.readLine());
        double priceOfRobes = Double.parseDouble(read.readLine());
        double priceOfBelts = Double.parseDouble(read.readLine());

        double percentLight = Math.ceil(student * 0.10);
        double freeBelts = Math.ceil(student / 6);

        double total = ((student + percentLight) * priceOfLightSabers) + (priceOfRobes * student) + ((student - freeBelts) * priceOfBelts);

        if (total <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", total - money);
        }

    }
}