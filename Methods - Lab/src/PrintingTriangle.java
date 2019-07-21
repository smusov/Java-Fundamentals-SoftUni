import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 1; i <=n ; i++) {
            printLine(i);
        }
        for (int i = n-1; i >=0 ; i--) {
            printLine(i);
        }

    }

    private static void printLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
