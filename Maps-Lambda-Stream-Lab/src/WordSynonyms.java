import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String,List<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(read.readLine());

        for (int i = 1; i <=n; i++) {
            String word = read.readLine();
            String synonym = read.readLine();

            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);

        }

        words.forEach((key, value) -> {
            System.out.print(key + " - ");
            System.out.println(value.toString().replaceAll("[\\[\\]]", ""));
        });

    }
}
