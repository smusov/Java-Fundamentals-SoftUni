import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FromLeftToTheRight {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {

            String[] input = read.readLine().split("\\s+");

            double firstNum = Double.parseDouble(input[0]);
            double secondNum = Double.parseDouble(input[1]);

            String maxNum = String.valueOf(Math.abs(Math.max(firstNum,secondNum)));

            Pattern pattern = Pattern.compile("([0-9.]+(?=E))");
            Matcher matcher = pattern.matcher(maxNum);

            int sum;

            if (matcher.find()){
                sum = Arrays.stream(matcher.group(0).replace(".","").split("")).mapToInt(Integer::parseInt).sum();
            }else {
                sum = Arrays.stream(maxNum.replace(".","").split("")).mapToInt(Integer::parseInt).sum();
            }

            System.out.println(sum);
        }
    }
}
