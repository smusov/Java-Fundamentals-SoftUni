import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String text = read.readLine();
        int count = Integer.parseInt(read.readLine());

        System.out.println(newText(text,count));

    }
    static String newText (String text , int count){

        String newText = "";

        for (int i = 0; i <count ; i++) {
            newText+=text;
        }
        return newText;

    }
}
