import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> wagons = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(read.readLine());

        String input;

        while (!"end".equals(input= read.readLine())){
            String[] data = input.split("\\s+");

            if (data[0].equals("Add")){
                wagons.add(Integer.parseInt(data[1]));
            }else {
                int people = Integer.parseInt(data[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i)+people<=maxCapacity){
                        wagons.set(i,people+wagons.get(i));
                        break;
                    }
                }
            }
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));
    }
}
