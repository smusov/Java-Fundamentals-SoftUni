import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d X %d = %d%n",n,i,n*i);
        }

    }
}
