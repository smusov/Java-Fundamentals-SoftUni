import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        char first = read.nextLine().charAt(0);
        char second = read.nextLine().charAt(0);
        char thirty = read.nextLine().charAt(0);

        System.out.printf("%c%c%c",first,second,thirty);
    }
}
