import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PokeMon {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(read.readLine());
        int M = Integer.parseInt(read.readLine());
        int Y = Integer.parseInt(read.readLine());

        int counter =0;
        int half = (N*50)/100;

        while (N>=M){

            counter++;
            N-=M;

            if (half==N){
                if (Y>0)
                    N/=Y;
            }
        }

        System.out.println(N);
        System.out.println(counter);

    }
}
