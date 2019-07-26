import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftUniParking {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        Map<String , String> data = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = read.readLine().split("\\s+");

            if (input[0].equals("register")){
                if (!data.containsKey(input[1])){
                    data.put(input[1],input[2]);
                    System.out.println(String.format("%s registered %s successfully",input[1],input[2]));
                }else{
                    System.out.println(String.format("ERROR: already registered with plate number %s",data.get(input[1])));
                }
            }else {
                if (data.containsKey(input[1])){
                    data.remove(input[1]);
                    System.out.println(String.format("%s unregistered successfully",input[1]));
                }else {
                    System.out.println(String.format("ERROR: user %s not found",input[1]));
                }
            }
        }
        data.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
