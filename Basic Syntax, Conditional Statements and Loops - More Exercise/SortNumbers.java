import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args)throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums= new ArrayList<>();

        for (int i = 0; i <3 ; i++) {
            nums.add(Integer.parseInt(read.readLine()));
        }
        nums.stream().sorted((e1,e2)->Integer.compare(e2,e1)).forEach(System.out::println);
    }
}