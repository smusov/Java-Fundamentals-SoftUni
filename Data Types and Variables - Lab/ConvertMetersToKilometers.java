import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int km = Integer.parseInt(read.nextLine());
        double m = km/1000.0;

        System.out.printf("%.2f",m);

    }
}
