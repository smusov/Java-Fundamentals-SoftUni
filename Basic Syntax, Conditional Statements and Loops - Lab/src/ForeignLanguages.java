import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForeignLanguages {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String country = read.readLine();

        switch (country){
            case "England":
            case "USA":
                System.out.println("English");
                break;

            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;

            default:
                System.out.println("unknown");
                break;
        }

    }
}
