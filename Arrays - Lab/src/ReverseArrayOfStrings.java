import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayOfStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[]nam = read.readLine().split(" ");

        for (int i = nam.length-1; i >=0 ; i--) {
            System.out.print(nam[i]+" ");
        }

    }
}
