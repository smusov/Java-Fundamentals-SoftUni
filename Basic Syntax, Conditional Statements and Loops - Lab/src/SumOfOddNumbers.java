import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfOddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(read.readLine());

        int counter = 0;

        int sum =0;

        for (int i = 1; i <Integer.MAX_VALUE ; i+=2) {
            counter++;
            if (counter<=count){
                sum+=i;
                System.out.println(i);
            }else {
                break;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
