import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Double> nums = Arrays.stream(read.readLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < nums.size()-1; i++) {

            if (nums.get(i).equals(nums.get(i + 1))){

                nums.set(i,nums.get(i)+nums.get(i+1));
                nums.remove(i+1);
                i=-1;

            }
        }
        System.out.println(joinedPrint(nums).trim());
    }
    private static String joinedPrint (List<Double>nums){

        String print= "";
        DecimalFormat format = new DecimalFormat("#.####");

        for (Double num : nums) {
            print += format.format(num) + " ";
        }

        return print;

    }
}
