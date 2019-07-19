import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[]num = read.readLine().split(" ");
        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n%num.length ; i++) {
            String firstElement = num[0];

            for (int j = 0; j <num.length-1; j++) {
                num[j]=num[j+1];
            }

            num[num.length-1]=firstElement;
        }

        System.out.println(String.join(" ", num));

    }
}
