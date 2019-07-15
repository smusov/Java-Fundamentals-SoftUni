import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] definitions = read.readLine().split(" \\| ");
        String[] words = read.readLine().split(" \\| ");

        Map<String, List<String>>dictionary = new LinkedHashMap<>();

        for (String element : definitions) {
            String[] data = element.split(": ");

            dictionary.putIfAbsent(data[0],new ArrayList<>());
            dictionary.get(data[0]).add(data[1]);

        }

        for (String element : words) {
            if (dictionary.containsKey(element)){
                List<String> word = new ArrayList<>(dictionary.get(element));
                System.out.println(element);
                word.stream().sorted((e1,e2)->Integer.compare(e2.length(),e1.length())).forEach(e-> System.out.println("-"+e));
            }
        }

        if (read.readLine().equals("List")){
            dictionary.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e-> System.out.print(e.getKey()+" "));
        }
    }
}
