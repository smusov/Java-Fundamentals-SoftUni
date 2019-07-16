import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(read.readLine());
        int second = Integer.parseInt(read.readLine());
        int third = Integer.parseInt(read.readLine());
        int fourth = Integer.parseInt(read.readLine());

        int sume1 = first+second;
        int sume2 = sume1/third;
        int sume3 = sume2*fourth;

        System.out.println(sume3);

    }
}
