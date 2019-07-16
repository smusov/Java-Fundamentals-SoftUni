import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecryptingMessage {
    public static void main(String[] args) throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int key = Integer.parseInt(read.readLine());
        int n = Integer.parseInt(read.readLine());

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String input = read.readLine();

            int inChar = input.charAt(0)+key;

            message.append((char)inChar);
        }
        System.out.println(message);
    }
}
