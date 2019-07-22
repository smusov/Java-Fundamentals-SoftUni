import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String input = read.readLine();

        printMiddleChar(input);



    }
    private static void printMiddleChar(String text){
        if (text.length()%2==0){
            System.out.println(text.substring(text.length()/2-1,text.length()/2+1));
        }else {
            int length = text.length()/2;
            System.out.println(text.charAt(length));
        }
    }
}
