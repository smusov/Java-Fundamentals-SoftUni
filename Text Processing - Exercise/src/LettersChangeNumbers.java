import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letters = "abcdefghijklmnopqrstuvwxyz";


        String[] data = read.readLine().split("\\s+");

        double sum = 0;

        for (String element : data) {

            double num = findNum(element);

            if (Character.isUpperCase(element.charAt(0))) {
                num /= capital.indexOf(element.charAt(0)) + 1;
            } else {
                num *= letters.indexOf(element.charAt(0)) + 1;
            }

            if (Character.isUpperCase(element.charAt(element.length() - 1))) {
                num -= capital.indexOf(element.charAt(element.length() - 1)) + 1;
            } else {
                num += letters.indexOf(element.charAt(element.length() - 1)) + 1;
            }
            sum += num;
        }

        System.out.println(String.format("%.2f",sum));
    }

    private static int findNum(String data) {

        StringBuilder num = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            if (Character.isDigit(data.charAt(i))){
                num.append(data.charAt(i));
            }
        }
        return Integer.parseInt(num.toString());
    }
}
