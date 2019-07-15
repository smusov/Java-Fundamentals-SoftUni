import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String firstName= read.nextLine();
        String lastName= read.nextLine();
        String symbol = read.nextLine();

        System.out.printf("%s%s%s",firstName,symbol,lastName);
    }
}
