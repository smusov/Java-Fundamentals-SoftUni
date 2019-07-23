import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays.stream(read.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        nums.removeIf(e->e<0);

        if (nums.isEmpty()){
            
            System.out.println("empty");
        }else {
            Collections.reverse(nums);
            System.out.println(nums.toString().replaceAll("[\\[\\],]",""));
        }

    }
}
