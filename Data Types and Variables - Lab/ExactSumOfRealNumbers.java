import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numbers = Integer.parseInt(read.nextLine());

        BigDecimal cal2 = BigDecimal.valueOf(0);

        for (int i = 1; i <=numbers ; i++) {

            BigDecimal cal = new BigDecimal(read.nextLine());
            cal2 =cal2.add(cal);
        }
        System.out.println(cal2);
    }
}
