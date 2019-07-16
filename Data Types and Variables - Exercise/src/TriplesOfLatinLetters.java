import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriplesOfLatinLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i <n ; i++) {
            char first = (char)('a'+i);
            for (int j = 0; j <n ; j++) {
                char second = (char)('a'+j);
                for (int k = 0; k <n; k++) {
                    char third = (char)('a'+k);
                    System.out.println(String.format("%c%c%c",first,second,third));
                }
            }
        }

    }
}
