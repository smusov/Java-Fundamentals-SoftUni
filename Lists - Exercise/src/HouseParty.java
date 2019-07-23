import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HouseParty {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        List<String>guest = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = read.readLine().split("\\s+");

            if (data[2].equals("going!")){
                if (!guest.contains(data[0])){
                    guest.add(data[0]);
                }else {
                    System.out.println(data[0]+" is already in the list!");
                }
            }else {
                if (guest.contains(data[0])){
                    guest.remove(data[0]);
                }else {
                    System.out.println(data[0]+" is not in the list!");
                }
            }
        }
        guest.forEach(System.out::println);
    }
}