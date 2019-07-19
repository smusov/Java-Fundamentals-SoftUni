import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotationOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays.stream(read.readLine().split("\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {

            input.add(input.get(0));
            input.remove(0);

        }

        input.forEach(e-> System.out.print(e+" "));
    }
}
