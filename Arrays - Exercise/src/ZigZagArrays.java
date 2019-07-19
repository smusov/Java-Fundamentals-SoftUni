import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        String firstNumbers = "";
        String secondNumbers = "";

        for (int i = 0; i < n; i++) {//1
            String[] first = read.readLine().split(" ");

            boolean check = false;

            if (i % 2 == 0) {
                check = true;
            }
            for (int j = 0; j < first.length / 2; j++) {
                if (j % 2 == 0 && check) {
                    firstNumbers += first[0] + " ";
                    secondNumbers += first[1] + " ";
                } else {
                    firstNumbers += first[1] + " ";
                    secondNumbers += first[0] + " ";
                }

            }
        }

        System.out.println(firstNumbers);
        System.out.println(secondNumbers);

    }
}
