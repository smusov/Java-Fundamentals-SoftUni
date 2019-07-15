import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String town = read.nextLine();
        int pop = Integer.parseInt(read.nextLine());
        short square = Short.parseShort(read.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,pop,square);
    }
}
