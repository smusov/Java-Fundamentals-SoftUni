import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> firstNums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>secondNums = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer>result = new ArrayList<>();

        int minLength = Math.min(firstNums.size(),secondNums.size());

        for (int i = 0; i < minLength; i++) {

            result.add(firstNums.get(i));
            result.add(secondNums.get(i));
        }
        if (firstNums.size()>secondNums.size()){

            result.addAll(firstNums.subList(minLength,firstNums.size()));
        }else {

            result.addAll(secondNums.subList(minLength,secondNums.size()));
        }
        System.out.println(result.toString().replaceAll("[\\[,\\]]",""));

    }
}
