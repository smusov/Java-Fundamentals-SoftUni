import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("\\|+");

        List<String> result = new ArrayList<>();

        for (int i = input.length-1; i >=0 ; i--) {
            List<String> splitData = Arrays.stream(input[i].split("\\s+")).filter(e->!e.equals("")).collect(Collectors.toList());
            result.addAll(splitData);
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]",""));
    }
}
