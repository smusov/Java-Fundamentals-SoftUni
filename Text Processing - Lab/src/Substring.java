import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Substring {
    public static void main(String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String word = read.readLine();
        String text = read.readLine();

        while (text.contains(word)){
            text=text.replace(word,"");
        }
        System.out.println(text);
    }
}
