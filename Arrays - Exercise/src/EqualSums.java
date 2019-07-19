import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int [] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int index = 0;
        boolean check = false;
        for (int i = 0; i < input.length; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j <i ; j++) {
                left+=input[j];
            }

            for (int j = i+1; j < input.length; j++) {
                right+=input[j];
            }

            if (left==right){
                index=i;
                check=true;
            }
        }

        if (check){
            System.out.println(index);
        }else {
            System.out.println("no");
        }
    }
}
