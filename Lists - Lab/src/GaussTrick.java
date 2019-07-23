import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int size = nums.size()/2;

        for (int i = 0; i <size ; i++) {
            int firstNum = nums.get(i);
            int index = nums.size()-1;
            int nextNum = nums.get(index);
            nums.set(i,firstNum+nextNum);
            nums.remove(index);
        }
        System.out.println(nums.toString().replaceAll("[\\[,\\]]",""));

    }
}
