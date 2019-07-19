import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopIntegersOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int first = input[input.length-1];

        List<Integer> result = new ArrayList<>();
        result.add(first);

        for (int i = input.length-2; i >=0; i--) {

            if (input[i]>first){

                result.add(input[i]);
                first=input[i];

            }

        }

        Collections.reverse(result);
        System.out.println(result.toString().replaceAll("[\\[\\],]",""));
    }
}
