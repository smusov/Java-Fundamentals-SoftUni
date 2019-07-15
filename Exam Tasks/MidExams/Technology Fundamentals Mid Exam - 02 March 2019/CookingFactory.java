import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CookingFactory {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input ;

        int bestSum = Integer.MIN_VALUE;
        int bestLenght = Integer.MIN_VALUE;
        int bestAverage = Integer.MIN_VALUE;
        List<Integer> bestSequense = new ArrayList<>();

        while (!"Bake It!".equals(input= read.readLine())){
            List<Integer>data = Arrays.stream(input.split("[#]+")).map(Integer::parseInt).collect(Collectors.toList());
        }

    }
}
