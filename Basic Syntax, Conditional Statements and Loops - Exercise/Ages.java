import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ages {

    public static void main(String[] args) throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        if (n<=2){
            System.out.println("baby");
        }else if (n<=13){
            System.out.println("child");
        }else if (n<=19){
            System.out.println("teenager");
        }else if (n<=65){
            System.out.println("adult");
        }else {
            System.out.println("elder");
        }

    }
}