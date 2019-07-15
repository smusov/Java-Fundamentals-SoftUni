import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrintAndSum {

    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(read.readLine());
        int stop = Integer.parseInt(read.readLine());

        List<Integer> nums = new ArrayList<>();

        for (int i = start; i <=stop ; i++) {
            nums.add(i);
        }

        System.out.println(nums.toString().replaceAll("[\\[\\],]",""));
        System.out.println("Sum: "+nums.stream().mapToInt(e->e).sum());
    }
}