import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddAndSubtract {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(read.readLine());
        int b = Integer.parseInt(read.readLine());
        int c = Integer.parseInt(read.readLine());
        System.out.println(subtractNum(sumTwoNumber(a, b), c));
    }
    private static int sumTwoNumber(int a , int b ){
        return a+b;
    }
    private static int subtractNum(int a , int b ){
        return a-b;
    }
}
