import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractFile {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String data = read.readLine();

        System.out.println("File name: "+data.substring(data.lastIndexOf("\\")+1,data.indexOf(".")));
        System.out.println("File extension: "+data.substring(data.indexOf(".")+1));

    }
}
