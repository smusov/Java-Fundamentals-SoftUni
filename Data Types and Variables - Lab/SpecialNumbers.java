import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpecialNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 1; i <=n ; i++) {

            String num = "";
            num+=i;

            int special = Arrays.stream(num.split("")).mapToInt(Integer::parseInt).sum();

            if (special==5||special==7||special==11){
                System.out.println(i+" -> True");
            }else {
                System.out.println(i+" -> False");
            }
        }
    }
}
