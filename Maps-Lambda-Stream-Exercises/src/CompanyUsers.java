import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> users = new TreeMap<>();

        String input;
        
        while(!"End".equals(input=read.readLine())){

            String[] data = input.split(" -> ");

            users.putIfAbsent(data[0],new ArrayList<>());
            if (!users.get(data[0]).contains(data[1])) {
                users.get(data[0]).add(data[1]);
            }
        }
        users.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(a -> System.out.println("-- " + a));
        });
    }
}
