import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NxNMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(read.readLine());

        firstLoop(num);

    }
    private static void firstLoop(int num){
        for (int i = 0; i < num ; i++) {
            printMatrix(num);
            System.out.println();
        }
    }
    private static void printMatrix (int printNum){
        for (int i = 0; i < printNum; i++) {
            System.out.print(printNum+" ");
        }
    }
}
