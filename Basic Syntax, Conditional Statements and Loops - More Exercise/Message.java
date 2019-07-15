import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numbersOfPush = Integer.parseInt(read.nextLine());

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numbersOfPush; i++) {

            String digits = read.nextLine();

            int digitLength = digits.length();
            char oneDigit = digits.charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);

            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = offset + digitLength - 1;
            int letterCode = letterIndex + 97;


            char letter = (char) letterCode;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            message.append(letter);


        }
        System.out.println(message);

    }
}