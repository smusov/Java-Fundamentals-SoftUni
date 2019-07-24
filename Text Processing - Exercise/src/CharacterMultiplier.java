import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] data = read.readLine().split("\\s+");

        String firstWord = data[0];
        String secondWord = data[1];

        int sum = 0;
        int index = 0;
        String longWord;

        if (firstWord.length() > secondWord.length()) {
            longWord = firstWord;
        } else {
            longWord = secondWord;
        }

        for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {
            int firstWordNum = firstWord.charAt(i);
            int secondWordNum = secondWord.charAt(i);

            sum += firstWordNum * secondWordNum;

            index++;

        }


        for (int i = index; i < longWord.length(); i++) {
            sum += longWord.charAt(i);
        }

        System.out.println(sum);
    }
}
