import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String username = read.nextLine();
        StringBuilder reversed = new StringBuilder(username);
        reversed.reverse();
        System.out.println(reversed);
    }
}