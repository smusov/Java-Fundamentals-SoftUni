import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class AMinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> items = new LinkedHashMap<>();
        
        String input;

        while(!"stop".equals(input=read.readLine())){
            String input2 = read.readLine();

            items.putIfAbsent(input,0);
            items.put(input,items.get(input)+Integer.parseInt(input2));

        }
        items.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
