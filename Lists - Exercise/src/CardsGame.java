import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer>first = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer>second = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (!first.isEmpty()&&!second.isEmpty()){

            if (first.get(0)>second.get(0)){
                first.add(second.get(0));
                first.add(first.get(0));
                first.remove(0);
                second.remove(0);
            }else if ((first.get(0))<second.get(0)){
                second.add(first.get(0));
                second.add(second.get(0));
                second.remove(0);
                first.remove(0);
            }else {
                first.remove(0);
                second.remove(0);
            }
        }
        String winner;
        if (first.size()>second.size()){
            winner= "First player wins! Sum: "+first.stream().mapToInt(e->e).sum();
        }else {
            winner="Second player wins! Sum: "+second.stream().mapToInt(e->e).sum();
        }

        System.out.println(winner);
    }
}
