import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int country = Integer.parseInt(read.nextLine());
        int years = country*100;
        int days = (int) (years*365.2422);
        int hours = days*24;
        int minutes = hours*60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",country,years,days,hours,minutes);

    }
}
