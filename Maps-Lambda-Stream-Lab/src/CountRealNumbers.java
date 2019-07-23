import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Map<Integer,Integer> countNum = new TreeMap<>();

        nums.forEach(e->{
            countNum.putIfAbsent(e,0);
            countNum.put(e,countNum.get(e)+1);
        });

        countNum.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}