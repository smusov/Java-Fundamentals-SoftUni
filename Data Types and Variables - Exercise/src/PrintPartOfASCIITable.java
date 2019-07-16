import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPartOfASCIITable {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(read.readLine());
        int b = Integer.parseInt(read.readLine());

        for (int i = a; i <=b ; i++) {
            System.out.print((char)i+" ");
        }

    }
}
