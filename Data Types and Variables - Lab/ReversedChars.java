import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        char first = read.nextLine().charAt(0);
        char second = read.nextLine().charAt(0);
        char thirty = read.nextLine().charAt(0);

        System.out.printf("%c%c%c",thirty,first,second);
    }
}
