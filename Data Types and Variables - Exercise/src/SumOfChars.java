import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfChars {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        byte n = Byte.parseByte(read.readLine());

        int sume = 0;

        for (int i = 0; i <n ; i++) {

            char a = read.readLine().charAt(0);
            sume+=a;
        }

        System.out.println("The sum equals: "+sume);

    }
}
