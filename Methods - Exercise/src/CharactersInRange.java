import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharactersInRange {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int firstChar = read.readLine().charAt(0);
        int secondChar = read.readLine().charAt(0);
        printChars(Math.min(firstChar,secondChar),Math.max(firstChar,secondChar));
    }

    private static void printChars(int startIndex, int endIndex) {

        for (int i = startIndex+1; i < endIndex; i++) {

            System.out.print((char) i + " ");
        }

    }
}
