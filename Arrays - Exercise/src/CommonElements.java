import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] first = read.readLine().split(" ");
        String[] second = read.readLine().split(" ");

        for (int i = 0; i <second.length ; i++) {

            for (int j = 0; j < first.length; j++) {

                if (second[i].equals(first[j])) {

                    System.out.print(second[i] + " ");
                }
            }
        }
    }
}
