import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ZigZagArraysOtherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> resultFirst = new ArrayList<>();
        List<String> resultSecond = new ArrayList<>();

        int n = Integer.parseInt(read.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = read.readLine().split("\\s+");
            if (i%2==0){
                resultFirst.add(input[1]);
                resultSecond.add(input[0]);
            }else {
                resultFirst.add(input[0]);
                resultSecond.add(input[1]);
            }
        }
        System.out.println(resultSecond.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(resultFirst.toString().replaceAll("[\\[\\],]", ""));
    }
}
